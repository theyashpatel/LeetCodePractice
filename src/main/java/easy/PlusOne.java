package easy;

//    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
//    The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//    Increment the large integer by one and return the resulting array of digits.
//    Link: https://leetcode.com/problems/plus-one/

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; --i) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
            if (carry == 0) break;
        }
        if (carry == 1) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, digits.length);
            return res;
        }
        return digits;
    }
}
