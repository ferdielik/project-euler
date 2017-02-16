package problems;

import java.util.Set;

import common.CommonMath;

public class p0003
{
    private static final long number = 600851475143l;

    public static void main(String[] args)
    {
        new p0003().run();
    }

    void run()
    {
        p0003();
    }

    /**
     * What is the largest prime factor of the number 600851475143 ?
     */
    private void p0003()
    {
        Set<Long> primeNumbers = CommonMath.primeMultipliersSet(number);

        long max = primeNumbers.stream().max(Long::compare).get();

        System.out.format("result: %s", max);  // 6857
    }


}