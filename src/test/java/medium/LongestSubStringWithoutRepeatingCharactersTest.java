package medium;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class LongestSubStringWithoutRepeatingCharactersTest {
    private final String s;
    private final int output;

    public LongestSubStringWithoutRepeatingCharactersTest(String s, int output) {
        this.s = s;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{"abcabcbb", 3});
        args.add(new Object[]{"bbbbb", 1});
        args.add(new Object[]{"pwwkew", 3});
        args.add(new Object[]{"", 0});
        return args;
    }

    @Test
    public void longestSubStringTest() {
        LongestSubStringWithoutRepeatingCharacters lss = new LongestSubStringWithoutRepeatingCharacters();
        Assert.assertEquals(output, lss.lengthOfLongestSubstring(s));
    }
}
