package easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class MonotonicArrayTest {
    private final int[] input;
    private final boolean output;

    public MonotonicArrayTest(int[] input, boolean output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{new int[]{1, 1, 2}, true});
        args.add(new Object[]{new int[]{2, 2, 1}, true});
        args.add(new Object[]{new int[]{1, 2, 2, 3}, true});
        args.add(new Object[]{new int[]{6,5,4,4}, true});
        args.add(new Object[]{new int[]{1, 3, 2}, false});
        args.add(new Object[]{new int[]{1, 2, 4, 5}, true});
        args.add(new Object[]{new int[]{1, 1, 1}, true});
        return args;
    }

    @Test
    public void isMonotonicTest() {
        MonotonicArray ma = new MonotonicArray();
        Assert.assertEquals(output, ma.isMonotonic(input));
    }
}
