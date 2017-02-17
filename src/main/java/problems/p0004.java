package problems;

import common.BaseMath;

public class p0004
{
    public static void main(String[] args)
    {
        new p0004().run();
    }

    void run()
    {
        p0004();
    }

    /**
     * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     */
    private void p0004()
    {
        long result = 0;

        for (int i = 100; i < 1000; i++)
        {
            for (int j = 100; j < 1000; j++)
            {
                long mul = i * j;
                if (BaseMath.isPalindromic(mul) && mul > result)
                {
                    result = mul;
                }

            }
        }

        System.out.format("result: %s", result);  // 906609
    }

}