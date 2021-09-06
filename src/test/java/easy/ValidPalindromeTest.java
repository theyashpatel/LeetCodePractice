package easy;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidPalindromeTest {
    private final String input;
    private final boolean output;

    public ValidPalindromeTest(String input, boolean output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        ArrayList<Object[]> args = new ArrayList<>();

        args.add(new Object[]{"Racecar", true});
        args.add(new Object[]{"abcba", true});
        args.add(new Object[]{"race", false});
        args.add(new Object[]{"race a car", false});
        args.add(new Object[]{"A man, a plan, a canal: Panama", true});

        return args;
    }

    @Test
    public void isPalindromeTest() {
        ValidPalindrome vp = new ValidPalindrome();
        Assert.assertEquals(output, vp.isPalindrome(input));
    }
}
