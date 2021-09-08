package easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ValidAnagramTest {
    private final String s;
    private final String t;
    private final boolean output;

    public ValidAnagramTest(String s, String t, boolean output) {
        this.s = s;
        this.t = t;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{"anagram", "nagaram", true});
        args.add(new Object[]{"rat", "car", false});
        return args;
    }

    @Test
    public void isMonotonicTest() {
        ValidAnagram va = new ValidAnagram();
        Assert.assertEquals(output, va.isAnagram(s, t));
    }
}
