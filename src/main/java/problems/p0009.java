package problems;

import java.util.HashSet;
import java.util.Set;

public class p0009
{
    public static void main(String[] args)
    {
        new p0009().run();
    }

    void run()
    {
        p0009();
    }

    /**
     * must be
     * a < b < c
     * a * a + b * b = c * c
     * <p>
     * <p>
     * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     * Find the product abc.
     */
    private void p0009()
    {
        final int len = 1000;
        int a, b, c;
        Set<String> possibilities = new HashSet<>();

        for (int aincrease = 1; aincrease < len; aincrease++)
        {
            for (int bincrease = 1; bincrease < len; bincrease++)
            {
                a = 0;
                b = 0;
                for (int i = 0; i < len - 2; i++)
                {
                    a += aincrease;
                    b += bincrease;
                    c = len - (a + b);

                    if (a > b || b > c || c <= 0 || possibilities.contains(String.format("%s", a * b * c)))
                    {
                        break;
                    }

                    possibilities.add(String.format("%s", a * b * c));

                    if (a * a + b * b == c * c)
                    {
                        System.out.format("a: %s, b: %s, c: %s \n", a, b, c);
                        System.out.format("result: %s", a * b * c); // 31875000
                    }
                }
            }
        }
    }
}