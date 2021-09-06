package easy;

//    Given an integer x, return true if x is palindrome integer.
//    An integer is a palindrome when it reads the same backward as forward.
//    For example, 121 is palindrome while 123 is not.
//
//    Follow up: Could you solve it without converting the integer to a string?
//
//    Link: https://leetcode.com/problems/palindrome-number/
//
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        return (reverseNumber(x) == x);
    }

    private int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + n % 10;
            n /= 10;
        }
        return reverse;
    }
}
