package problems;

import java.math.BigInteger;
import java.util.Arrays;

public class p0016 extends AbstractProblem
{
    /**
     * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
     * <p>
     * What is the sum of the digits of the number 2^1000?
     */

    public static void main(String[] args) throws Exception
    {
        new p0016().main();
    }

    @Override
    public void run() throws Exception
    {
        BigInteger base = new BigInteger("2");
        String poString = base.pow(1000).toString();

        int sum = Arrays.stream(poString.split("")).mapToInt(Integer::valueOf).sum();
        System.out.println(sum);
    }

}
