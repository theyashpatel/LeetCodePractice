package easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class PlusOneTest {
    private final int[] input;
    private final int[] output;

    public PlusOneTest(int[] input, int[] output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{new int[]{2, 2, 1}, new int[]{2, 2, 2}});
        args.add(new Object[]{new int[]{5}, new int[]{6}});
        args.add(new Object[]{new int[]{9}, new int[]{1, 0}});
        args.add(new Object[]{new int[]{9, 9}, new int[]{1, 0, 0}});
        return args;
    }

    @Test
    public void isValidTest() {
        PlusOne po = new PlusOne();
        Assert.assertEquals(Arrays.toString(output), Arrays.toString(po.plusOne(input)));
    }
}