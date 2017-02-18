package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import common.BaseMath;
import common.CommonUtils;

public class p0010 extends AbstractProblem
{
    private final long LIMIT = 2000000;
    private final int THREAD_COUNT = 5;
    private final int RANGE_PER_THREAD = 200;

    public static void main(String[] args) throws Exception
    {
        new p0010().main();
    }

    /**
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     * Find the sum of all the primes below two million.
     */
    public void run() throws Exception
    {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);

        long allSum[] = {2l};
        List<Callable<Long>> tasks = new ArrayList<>();

        for (List<Long> numbersPerThread : CommonUtils.splitCollection(build(), RANGE_PER_THREAD))
        {
            Callable<Long> callable = () ->
            {
                long sum = 0l;
                for (Long i : numbersPerThread)
                {
                    if (BaseMath.isPrimeNumber(i))
                    {
                        sum += i;
                    }
                }
                return sum;
            };
            tasks.add(callable);
        }

        executor.invokeAll(tasks)
                .stream()
                .map(future ->
                {
                    try
                    {
                        return future.get();
                    }
                    catch (Exception e)
                    {
                        throw new IllegalStateException(e);
                    }
                })
                .forEach(a -> allSum[0] += a);

        executor.shutdown();

        System.out.format("result: %s\n", allSum[0]); // 142913828922 --- ~ 500ms
    }

    private List<Long> build()
    {
        List<Long> ids = new ArrayList<>();
        for (long i = 1; i < LIMIT; i += 2)
        {
            ids.add(i);
        }
        return ids;
    }
}