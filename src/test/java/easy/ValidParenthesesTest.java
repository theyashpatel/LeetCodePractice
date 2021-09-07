package easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ValidParenthesesTest {
    private final String input;
    private final boolean output;

    public ValidParenthesesTest(String input, boolean output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{"([}}])", false});
        args.add(new Object[]{"}", false});
        args.add(new Object[]{"()", true});
        args.add(new Object[]{"()[]{}", true});
        args.add(new Object[]{"(]", false});
        args.add(new Object[]{"([)]", false});
        args.add(new Object[]{"{[]}", true});
        args.add(new Object[]{"{", false});
        return args;
    }

    @Test
    public void isValidTest() {
        ValidParentheses vp = new ValidParentheses();
        Assert.assertEquals(output, vp.isValid(input));
    }
}
