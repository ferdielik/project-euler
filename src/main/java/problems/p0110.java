package problems;

public class p0110 extends AbstractProblem
{
    /**
     * In the following equation x, y, and n are positive integers.
     * <p>
     * 1/x + 1/y = 1/n
     * It can be verified that when n = 1260 there are 113 distinct solutions and this is the least value of n for which the total number of distinct solutions exceeds one hundred.
     * <p>
     * What is the least value of n for which the number of distinct solutions exceeds four million?
     * <p>
     * NOTE: This problem is a much more difficult version of Problem 108 and as it is well beyond the limitations of a brute force approach it requires a clever implementation.
     */

    public static void main(String[] args) throws Exception
    {
        new p0110().main();
    }

    @Override
    public void run() throws Exception
    {

        double x = 0, y = 0, n = 0;
        n = x * y / x + y;


        for (x = 0, y = 0; y < 100; x++, y++)
        {

        }



    }

}
