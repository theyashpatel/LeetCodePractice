package easy;

//    Given a signed 32-bit integer x, return x with its digits reversed.
//    If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//    Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//    Link: https://leetcode.com/problems/reverse-integer/

public class ReverseInteger {
    public int reverse(int x) {
        int reverse = 0;
        int pop;
        while (x != 0) {
            if (reverse < Integer.MIN_VALUE / 10 || reverse > Integer.MAX_VALUE / 10) {
                return 0;
            }
            reverse = (reverse * 10) + x % 10;
            x /= 10;
        }
        return reverse;
    }
}
