package medium;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class LongestPalindromicSubstringTest {
    private final String input;
    private final String output;

    public LongestPalindromicSubstringTest(String input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{"babad", "aba"});
        args.add(new Object[]{"cbbd", "bb"});
        args.add(new Object[]{"a", "a"});
        args.add(new Object[]{"ac", "c"});
        return args;
    }

    @Test
    public void longestPalindromeTest() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        Assert.assertEquals(output, lps.longestPalindrome(input));
    }
}
