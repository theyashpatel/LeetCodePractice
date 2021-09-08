package easy;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class LengthOfLastWordTest {
    private final String input;
    private final int output;

    public LengthOfLastWordTest(String input, int output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{"Hello World", 5});
        args.add(new Object[]{"   fly me   to   the moon  ", 4});
        args.add(new Object[]{"luffy is still joyboy", 6});
        return args;
    }

    @Test
    public void isValidTest() {
        LengthOfLastWord ll = new LengthOfLastWord();
        Assert.assertEquals(output, ll.lengthOfLastWord(input));
    }
}
