package easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ReverseIntegerTest {
    private final int input;
    private final int output;

    public ReverseIntegerTest(int input, int output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{123, 321});
        return args;
    }

    @Test
    public void reverseTest() {
        ReverseInteger ri = new ReverseInteger();
        Assert.assertEquals(output, ri.reverse(input));
    }
}
