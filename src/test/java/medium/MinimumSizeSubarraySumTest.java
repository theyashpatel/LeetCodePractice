package medium;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class MinimumSizeSubarraySumTest {
    private final int[] nums;
    private final int target;
    private final int output;

    public MinimumSizeSubarraySumTest(int[] nums, int target, int output) {
        this.nums = nums;
        this.target = target;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{
                new int[]{2, 3, 1, 2, 4, 3}, 7, 2
        });
        args.add(new Object[]{
                new int[]{1, 4, 4}, 4, 1
        });
        args.add(new Object[]{
                new int[] {1,1,1,1,1,1,1,1}, 11, 0
        });

        return args;
    }

    @Test
    public void lengthOfLongestSubstringTest() {
        MinimumSizeSubarraySum ms = new MinimumSizeSubarraySum();
        Assert.assertEquals(output, ms.minSubArrayLen(target, nums));
    }
}
