package common;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ferdielik on 17/02/2017.
 */
public class CommonUtils
{
    public static <T> List<List<T>> splitCollection(List<T> list, final int L)
    {
        List<List<T>> parts = new ArrayList<List<T>>();
        final int N = list.size();
        for (int i = 0; i < N; i += L)
        {
            parts.add(new ArrayList<T>(
                    list.subList(i, Math.min(N, i + L)))
            );
        }
        return parts;
    }
}
