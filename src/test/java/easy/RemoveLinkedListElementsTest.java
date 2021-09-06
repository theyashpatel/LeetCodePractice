package easy;

import helper.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class RemoveLinkedListElementsTest {
    private final ListNode head;
    private final int val;
    private final ListNode output;

    public RemoveLinkedListElementsTest(ListNode head, int val, ListNode output) {
        this.head = head;
        this.val = val;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{
                new ListNode(new int[]{1, 2, 6, 3, 4, 5, 6}), 6, new ListNode(new int[]{1, 2, 3, 4, 5})
        });
        args.add(new Object[]{
                new ListNode(new int[]{7,7,7,7}), 7, new ListNode(new int[]{})
        });
        args.add(new Object[]{
                new ListNode(new int[]{}), 1, new ListNode(new int[]{})
        });
        return args;
    }

    @Test
    public void removeElementsTest() {
        RemoveLinkedListElements rle = new RemoveLinkedListElements();
        Assert.assertEquals(output.toString(), rle.removeElements(head, val).toString());
    }
}
