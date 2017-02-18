package common;

public class StopWatch
{
    long start;
    long end;

    public void start()
    {
        start = System.currentTimeMillis();
    }

    public long end()
    {
        return System.currentTimeMillis() - start;
    }
}