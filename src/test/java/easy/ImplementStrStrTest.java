package easy;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ImplementStrStrTest {
    private final String haystack;
    private final String needle;
    private final int output;

    public ImplementStrStrTest(String haystack, String needle, int output) {
        this.haystack = haystack;
        this.needle = needle;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        ArrayList<Object[]> args = new ArrayList<>();

        args.add(new Object[]{"hello", "ll", 2});
        args.add(new Object[]{"aaaaa", "bba", -1});
        args.add(new Object[]{"", "", 0});

        return args;
    }

    @Test
    public void isPalindromeTest() {
        ImplementStrStr imp = new ImplementStrStr();
        Assert.assertEquals(output, imp.strStr(haystack, needle));
    }
}
