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
public class MergeTwoSortedListsTest {
    private final ListNode l1;
    private final ListNode l2;
    private final ListNode output;

    public MergeTwoSortedListsTest(ListNode l1, ListNode l2, ListNode output) {
        this.l1 = l1;
        this.l2 = l2;
        this.output = output;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputArgs() {
        List<Object[]> args = new ArrayList<>();
        args.add(new Object[]{
                new ListNode(new int[]{1, 2, 3}),
                new ListNode(new int[]{1, 3, 4}),
                new ListNode((new int[]{1, 1, 2, 3, 3, 4}))

        });
        args.add(new Object[]{
                new ListNode(new int[]{1, 2, 4}),
                new ListNode(new int[]{1, 3, 4}),
                new ListNode((new int[]{1, 1, 2, 3, 4, 4}))

        });
        return args;
    }

    @Test
    public void isValidTest() {
        MergeTwoSortedLists mt = new MergeTwoSortedLists();
        Assert.assertEquals(output.toString(), mt.mergeTwoLists(l1, l2).toString());
    }
}