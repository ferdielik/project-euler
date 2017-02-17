package problems;

import common.BaseMath;

public class p0006
{
    public static void main(String[] args)
    {
        new p0006().run();
    }

    void run()
    {
        p0006();
    }

    /**
     * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
     * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */
    private void p0006()
    {
        double num = 100;
        double result = findDiff(num);

        System.out.format("result: %s", Double.valueOf(result).longValue());  // 25164150
    }

    private double findDiff(double num)
    {
        double sumOfTheSquare = 0;

        double factorial = BaseMath.factorial(num);
        double squareOfTheSum = factorial * factorial;

        for (double i = 0; i <= num; i++)
            sumOfTheSquare += i * i;

        System.out.printf(sumOfTheSquare + " " + squareOfTheSum);

        return squareOfTheSum - sumOfTheSquare;
    }
}