package problems;

import common.CommonMath;

public class p0005
{
    public static void main(String[] args)
    {
        new p0005().run();
    }

    void run()
    {
        p0005();
    }

    /**
     * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
     * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */
    private void p0005()
    {
        long result = CommonMath.LCM(build(20));

        System.out.format("result: %s", result);  // 232792560
    }


    private long[] build(long number)
    {
        long[] fac = new long[(int) number];
        for (long i = 1; i < number; i++)
        {
            fac[(int) i] = i;
        }
        return fac;
    }

}