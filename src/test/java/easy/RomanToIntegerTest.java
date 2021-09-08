package easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RomanToIntegerTest {
    private final String input;
    private final int output;

    public RomanToIntegerTest(String input, int output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{"III", 3});
        args.add(new Object[]{"IV", 4});
        args.add(new Object[]{"IX", 9});
        args.add(new Object[]{"LVIII", 58});
        args.add(new Object[]{"MCMXCIV", 1994});
        return args;
    }

    @Test
    public void romanToIntTest() {
        RomanToInteger rt = new RomanToInteger();
        Assert.assertEquals(output, rt.romanToInt(input));
    }
}
