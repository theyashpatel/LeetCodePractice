package easy;



//    Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//    Clarification:
//    What should we return when needle is an empty string? This is a great question to ask during an interview.
//    For the purpose of this problem, we will return 0 when needle is an empty string.
//    This is consistent to C's strstr() and Java's indexOf().
//    Link: https://leetcode.com/problems/implement-strstr/

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            boolean isNeedle = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) isNeedle = false;
            }
            if (isNeedle) return i;
        }
        return -1;
    }
}
