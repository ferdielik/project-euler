package problems;

import common.BaseMath;

public class p0007
{
    public static void main(String[] args)
    {
        new p0007().run();
    }

    void run()
    {
        p0007();
    }

    /**
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     * What is the 10 001st prime number?
     */

    private void p0007()
    {
        int index = 0;
        double i = 1;
        double lastPrimeNumber = 0;

        while (index != 10001)
        {
            i++;
            if (BaseMath.isPrimeNumber(i))
            {
                lastPrimeNumber = i;
                index++;
            }
        }

        System.out.format("result: %s", lastPrimeNumber);  // 104743
    }
}