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
public class DeleteNodeLinkedListTest {
    // dumbest question I have ever seen
    // don't even know how to test this
    // check the source to know about the problem
    // given test looks dumb but thats how it is :)

    private final ListNode input;
    private final ListNode output;

    public DeleteNodeLinkedListTest(ListNode input, ListNode output) {
        this.input = input;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{
                new ListNode(new int[]{4, 5, 1, 9}),
                new ListNode(new int[]{4, 1, 9})
        });
        return args;
    }

    @Test
    public void deleteNodeTest() {
        DeleteNodeLinkedList dn = new DeleteNodeLinkedList();
        dn.deleteNode(input.next);
        Assert.assertEquals(output.toString(), input.toString());
    }
}
