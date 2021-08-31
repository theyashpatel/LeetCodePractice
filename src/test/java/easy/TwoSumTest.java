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
public class TwoSumTest {
    private final int[] nums;
    private final int target;
    private final int[] output;

    public TwoSumTest(int[] nums, int target, int[] output) {
        this.nums = nums;
        this.target = target;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArrays() {
        List<Object []> args = new ArrayList<>();

        args.add(new Object[] {new int[]{2, 3, 5, 7}, 7, new int[]{0, 2}});
        args.add(new Object[]{new int[]{4, 8, 2, 5, 1}, 5, new int[]{0, 4}});
        return args;
    }

    @Test
    public void twoSumTest() {
        TwoSum ts = new TwoSum();
        Assert.assertArrayEquals(output, ts.twoSum(nums, target));
    }

}
