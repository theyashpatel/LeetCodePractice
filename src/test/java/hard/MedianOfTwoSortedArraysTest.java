package hard;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class MedianOfTwoSortedArraysTest {
    private final int[] num1;
    private final int[] num2;
    private final double output;

    public MedianOfTwoSortedArraysTest(int[] num1, int[] num2, double output) {
        this.num1 = num1;
        this.num2 = num2;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();

        args.add(new Object[]{new int[]{}, new int[]{2,3}, 2.5});
        args.add(new Object[]{new int[]{}, new int[]{2,3,4}, 3.0});
        args.add(new Object[]{new int[]{2,3}, new int[]{}, 2.5});
        return args;
    }

    @Test
    public void findMedianSortedArraysTest() {
        MedianOfTwoSortedArrays mot = new MedianOfTwoSortedArrays();
        Assert.assertEquals(output, mot.findMedianSortedArrays(num1,num2), 0);
    }
}
