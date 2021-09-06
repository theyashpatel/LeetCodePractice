package medium;

import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class AddTwoNumbersTest {
    private final ListNode l1;
    private final ListNode l2;
    private final ListNode output;

    public AddTwoNumbersTest(ListNode l1, ListNode l2, ListNode output) {
        this.l1 = l1;
        this.l2 = l2;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArrays() {
        List<Object[]> args = new ArrayList<>();

        args.add( new Object[] {
                new ListNode(new int[] {2,4,3}),
                new ListNode(new int[] {5,6,4}),
                new ListNode(new int[] {7,0,8})
        });
        args.add( new Object[] {
                new ListNode(new int[] {0}),
                new ListNode(new int[] {0}),
                new ListNode(new int[] {0})
        });
        args.add( new Object[] {
                new ListNode(new int[] {9,9,9,9,9,9,9}),
                new ListNode(new int[] {9,9,9,9}),
                new ListNode(new int[] {8,9,9,9,0,0,0,1})
        });

        return args;
    }

    @Test
    public void addTwoNumbersTest() {
        AddTwoNumbers atn = new AddTwoNumbers();
        Assert.assertEquals(output.toString(), atn.addTwoNumbers(l1, l2).toString());
    }
}
