package hard;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class LongestValidParenthesesTest {
    private final String input;
    private final int output;

    public LongestValidParenthesesTest(String input, int output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{"()(()", 2});
        args.add(new Object[]{"(()", 2});
        args.add(new Object[]{")()())", 4});
        args.add(new Object[]{"", 0});
        return args;
    }

    @Test
    public void longestValidParenthesesTest() {
        LongestValidParentheses lv = new LongestValidParentheses();
        Assert.assertEquals(output, lv.longestValidParentheses(input));
    }
}
