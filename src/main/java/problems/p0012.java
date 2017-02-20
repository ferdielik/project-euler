package problems;

import java.util.ArrayList;
import java.util.List;

import common.BaseMath;

public class p0012 extends AbstractProblem
{
    /**
     * What is the value of the first triangle number to have over five hundred divisors?

     */
    public static void main(String[] args) throws Exception
    {
        new p0012().main();
    }

    @Override
    public void run() throws Exception
    {

        long limit = 500;
        long triangleNumber;
        long i = 1;
        while (true)
        {
            triangleNumber = findTriangleNumber(i);
            List<Long> divisors = BaseMath.findDivisors(triangleNumber);
            if (divisors.size() > limit)
                break;
            i++;
        }

        System.out.println("result " + triangleNumber); // 76576500
    }

    private static long findTriangleNumber(long number)
    {
        long triNumber = 0;
        for (long i = 1; i <= number; i++)
        {
            triNumber += i;
        }
        return triNumber;
    }


}
