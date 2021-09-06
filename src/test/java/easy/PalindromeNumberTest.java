package easy;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PalindromeNumberTest {
    private final int input;
    private final boolean output;

    public PalindromeNumberTest(int input, boolean output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        ArrayList<Object[]> args = new ArrayList<>();

        args.add(new Object[]{121, true});
        args.add(new Object[]{123, false});
        args.add(new Object[]{-121, false});
        args.add(new Object[]{10, false});
        args.add(new Object[]{-101, false});
        args.add(new Object[]{0, true});

        return args;
    }

    @Test
    public void isPalindromeTest() {
        PalindromeNumber pn = new PalindromeNumber();
        Assert.assertEquals(output, pn.isPalindrome(input));
    }
}
