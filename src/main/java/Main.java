import easy.ReverseLinkedList.ListNode;
import easy.ReverseLinkedList.ReverseLinkedList;

public class Main {
  public static void main(String[] args) {
    ListNode node = new ListNode(new int[]{1, 2, 3});
    ListNode res = new ReverseLinkedList().reverseList(node);
    System.out.println(res.toString());
  }
}
