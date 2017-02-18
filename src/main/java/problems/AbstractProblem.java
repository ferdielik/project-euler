package problems;

import common.StopWatch;

public abstract class AbstractProblem
{
    public void main() throws Exception
    {
        StopWatch timer = new StopWatch();
        timer.start();
        this.run();
        System.out.println("completed in " + timer.end() + "ms");

    }

    public abstract void run() throws Exception;
}
