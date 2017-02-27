package problems;

public class p0014 extends AbstractProblem
{
    /**
     * The following iterative sequence is defined for the set of positive integers:
     * <p>
     * n → n/2 (n is even)
     * n → 3n + 1 (n is odd)
     * Using the rule above and starting with 13, we generate the following sequence:
     * <p>
     * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
     * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
     * <p>
     * Which starting number, under one million, produces the longest chain?
     * <p>
     * NOTE: Once the chain starts the terms are allowed to go above one million.
     */

    public static void main(String[] args) throws Exception
    {
        new p0014().main();
    }

    @Override
    public void run() throws Exception
    {
        long limit = 1000000;
        long maxChain = 0, maxNumber = 0;
        for (int i = 13; i < limit; i++)
        {
            long l = chainCount(i);
            if (l > maxChain)
            {
                maxChain = l;
                maxNumber = i;
            }
        }

        System.out.println("result: " + maxNumber);
    }

    private long chainCount(long number)
    {
        long last = number;
        long index = 0;
        while (true)
        {
            index++;
            last = next(last);
            if (last == 1)
                break;
        }
        return index;
    }

    private static long next(long current)
    {
        if (current % 2 == 0)
        {
            return current / 2;
        }
        return current * 3 + 1;
    }
}
