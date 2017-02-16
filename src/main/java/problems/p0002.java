package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p0002
{
    public static void main(String[] args)
    {
        new p0002().run();
    }

    void run()
    {
        p0002();
    }

    /**
     * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
     */
    private void p0002()
    {
        long sum = 0;
        long limit = 4000000;
        List<Long> values = new ArrayList<>(Arrays.asList(1L, 1L));

        for (int i = 1; sum <= limit; i++)
        {
            long val = values.get(i) + values.get(i - 1);
            values.add(val);
            if (val % 2 == 0)
                sum += val;
        }

        System.out.format("result: %s", sum);  // 4613732
    }
}