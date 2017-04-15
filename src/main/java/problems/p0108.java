package problems;

import java.util.ArrayList;
import java.util.List;

import common.BaseMath;

public class p0108 extends AbstractProblem
{
    /**
     * In the following equation x, y, and n are positive integers.
     * <p>
     * 1
     * x
     * +
     * 1
     * y
     * =
     * 1
     * n
     * For n = 4 there are exactly three distinct solutions:
     * <p>
     * 1/5 + 1/20 =1/416+1/12
     * =
     * 1
     * 4
     * 1
     * 8
     * +
     * 1
     * 8
     * =
     * 1
     * 4
     * What is the least value of n for which the number of distinct solutions exceeds one-thousand?
     * <p>
     * NOTE: This problem is an easier version of Problem 110; it is strongly advised that you solve this one first.
     */

    public static void main(String[] args) throws Exception
    {
        new p0108().main();
    }

    @Override
    public void run() throws Exception
    {
        double n = 1260;
        long solutions = count(n);

        while (0 > solutions)
        {
            n++;
            solutions = count(n);
            System.out.println(n + "--> " + solutions);
        }

        System.out.println("solution: " + n + " -- > " + solutions);
    }


    long count(double n)
    {
        final int[] counter = {0};
        List<Long> divisors = BaseMath.findDivisors((long) n);
        divisors.add((long) n);
        List<String> sol = new ArrayList<>();

        double limit = n + Math.sqrt(n);
        for (double i = 1; i < limit; i++)
        {
            double divider = i;
            for (double x = 1; x < divider; x++)
            {
                double xx = divider * n / x;
                double yy = divider * n / (divider - x);
                String hash = Math.min(xx, yy) + "-" + Math.max(xx, yy);

                if (xx % 1 != 0 || yy % 1 != 0 || sol.contains(hash))
                {
                    continue;
                }

                if (n == (xx * yy) / (xx + yy))
                {
                    System.out.format("\n x: %s, y: %s, xx: %s, yy: %s", x, divider - x, xx, yy);

                    counter[0]++;
                    sol.add(hash);
                }
            }
        }

        return counter[0];
    }


}
