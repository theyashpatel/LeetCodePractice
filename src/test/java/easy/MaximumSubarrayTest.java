package easy;
import easy.MaximumSubarray;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class MaximumSubarrayTest {
    private final int[] input;
    private final int output;

    public MaximumSubarrayTest(int[] input, int output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{
                new int[]{-2,1,-3,4,-1,2,1,-5,4}, 6
        });
        args.add(new Object[]{
                new int[]{1}, 1
        });
        args.add(new Object[]{
                new int[]{5,4,-1,7,8}, 23
        });

        return args;
    }

    @Test
    public void lengthOfLongestSubstringTest() {
        MaximumSubarray ms = new MaximumSubarray();
        Assert.assertEquals(output, ms.maxSubArray(input));
    }
}
