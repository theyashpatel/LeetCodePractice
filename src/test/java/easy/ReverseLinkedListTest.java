package easy;

import easy.ReverseLinkedList.ListNode;
import easy.ReverseLinkedList.ReverseLinkedList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ReverseLinkedListTest {
    private final ListNode input;
    private final ListNode output;

    public ReverseLinkedListTest(ListNode input, ListNode output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();

        args.add(new Object[]{
                new ListNode(new int[] {1,2,3}),
                new ListNode(new int[] {3,2,1})
        });
        args.add(new Object[]{
                new ListNode(new int[] {1,2}),
                new ListNode(new int[] {2,1})
        });
        args.add(new Object[]{
                new ListNode(new int[] {}),
                new ListNode(new int[] {})
        });
        return args;
    }

    @Test
    public void reverseListTest() {
        ReverseLinkedList rll = new ReverseLinkedList();
        Assert.assertEquals(output.toString(), rll.reverseList(input).toString());
    }
}
