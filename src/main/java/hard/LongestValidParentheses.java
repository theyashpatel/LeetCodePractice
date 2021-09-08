package hard;
import java.util.Stack;

//    Given a string containing just the characters '(' and ')',
//    find the length of the longest valid (well-formed) parentheses substring.
//    Link: https://leetcode.com/problems/longest-valid-parentheses/

// TODO: 9/8/21 come back later

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int cur = 0;
        int max = 0;
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == ')') {
                    stack.pop();
                    cur += 2;
                    max = Math.max(max, cur);
                }
                else {
                    cur = 0;
                    stack.empty();
                }
            }
        }
        return max;
    }
}
