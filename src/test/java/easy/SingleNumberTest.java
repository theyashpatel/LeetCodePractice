package easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SingleNumberTest {
    private final int[] input;
    private final int output;

    public SingleNumberTest(int[] input, int output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{new int[]{2, 2, 1}, 1});
        args.add(new Object[]{new int[]{4,1,2,1,2}, 4});
        args.add(new Object[]{new int[]{1}, 1});
        return args;
    }

    @Test
    public void isValidTest() {
        SingleNumber sn = new SingleNumber();
        Assert.assertEquals(output, sn.singleNumber(input));
    }
}
