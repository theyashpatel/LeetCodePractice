package easy;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LongestCommonPrefixTest {
    private final String[] input;
    private final String output;

    public LongestCommonPrefixTest(String[] input, String output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        ArrayList<Object[]> args = new ArrayList<>();

        args.add(new Object[]{
                new String[] {"dog","racecar","car"},
                ""
        });
        args.add(new Object[]{
           new String[] {"flower","flow","flight"},
           "fl"
        });

        return args;
    }

    @Test
    public void isPalindromeTest() {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        Assert.assertEquals(output, lcp.longestCommonPrefix(input));
    }
}
