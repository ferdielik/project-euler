package common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ferdielik on 16/02/2017.
 */
public class CommonMath
{
    public static double factorial(double number)
    {
        double sum = 0;
        for (double i = 0; i <= number; i++)
            sum += i;
        return sum;
    }

    /**
     * Least Common Multiple
     */
    public static long LCM(long... values)
    {
        Map<Long, Long> multiples = new HashMap<>();

        for (long n : values)
        {
            Map<Long, Long> ns = primeMultipliers(n);
            for (long key : ns.keySet())
            {
                if (multiples.get(key) == null)
                {
                    multiples.put(key, ns.get(key));
                }
                else if (ns.get(key) > multiples.get(key))
                {
                    multiples.put(key, ns.get(key));
                }
            }

        }

        long mul = 1;
        for (long k : multiples.keySet())
        {
            long a = 1;

            for (long i = 0; i < multiples.get(k); i++)
            {
                a *= k;
            }
            mul = mul * a;

        }

        return mul;
    }

    public static Set<Long> primeMultipliersSet(long number)
    {
        Set<Long> numbers = new HashSet<>();
        long num = number;
        for (int i = 2; i <= num; i++)
        {
            while (num % i == 0 && isPrimeNumber(i))
            {
                numbers.add((long) i);
                num = num / i;
            }
        }

        return numbers;
    }

    public static Map<Long, Long> primeMultipliers(long number)
    {
        Map<Long, Long> numbers = new HashMap<>();
        long num = number;
        for (long i = 2; i <= num; i++)
        {
            while (num % i == 0 && isPrimeNumber(i))
            {
                if (numbers.get(i) == null)
                {
                    numbers.put(i, 1l);
                }
                else
                {
                    numbers.put(i, numbers.get(i) + 1);
                }
                num = num / i;
            }
        }

        return numbers;
    }

    public static boolean isPalindromic(long number)
    {
        String num = String.valueOf(number);
        int length = num.length();

        int part = length / 2;

        for (int i = 0; i <= part; i++)
        {
            if (num.toCharArray()[i] != num.toCharArray()[length - i - 1])
                return false;
        }

        return true;
    }

    public static boolean isPrimeNumber(long number)
    {
        for (long i = 2; i < number; i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
