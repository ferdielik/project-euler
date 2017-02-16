package problems;

public class p0001
{
    public static void main(String[] args)
    {
        new p0001().run();
    }

    void run()
    {
        p0001();
    }

    /**
     * Find the sum of all the multiples of 3 or 5 below 1000.
     */
    private void p0001()
    {
        int sum = 0;
        for (int i = 0; i < 1000; i++)
        {
            if (i % 5 == 0 || i % 3 == 0)
                sum += i;
        }

        System.out.format("result: %s", sum);  // 233168
    }
}