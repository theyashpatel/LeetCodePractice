package easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            if (length == 0 && s.charAt(i) == ' ') continue;
            if (length > 0 && s.charAt(i) == ' ') break;
            length++;
        }
            return length;
    }
}

//    Given a string s consisting of some words separated by some number of spaces,
//    return the length of the last word in the string.
//    A word is a maximal substring consisting of non-space characters only.

//    Constraints:
//    1 <= s.length <= 104
//    s consists of only English letters and spaces ' '.
//    There will be at least one word in s.

//    Link: https://leetcode.com/problems/length-of-last-word/
