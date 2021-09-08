package medium;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class LongestSubstringAtMostTwoDistinctCharsTest {
    private final String s;
    private final int output;

    public LongestSubstringAtMostTwoDistinctCharsTest(String s, int output) {
        this.s = s;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{"a", 1});
        args.add(new Object[]{"ab", 2});
        args.add(new Object[]{"ababcccccc", 7});
        args.add(new Object[]{"eceba", 3});
        args.add(new Object[]{"eceebba", 4});
        args.add(new Object[]{"ccaabbb", 5});
        args.add(new Object[]{"ababbcccc", 6});
        args.add(new Object[]{"", 0});
        args.add(new Object[]{null, 0});
        return args;
    }

    @Test
    public void lengthOfLongestSubstringTest() {
        LongestSubstringAtMostTwoDistinctChars lss = new LongestSubstringAtMostTwoDistinctChars();
        Assert.assertEquals(output, lss.lengthOfSubString(s));
    }
}
