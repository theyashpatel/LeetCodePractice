import easy.MergeSortedArray;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
    int[] num2 = new int[]{2, 5, 6};
    MergeSortedArray ms = new MergeSortedArray();
    ms.merge(num1, num1.length - num2.length, num2, num2.length);
    System.out.println(Arrays.toString(num1));
  }
}
