package easy;


//    Write a function to find the longest common prefix string amongst an array of strings.
//    If there is no common prefix, return an empty string "".
//    Link: https://leetcode.com/problems/longest-common-prefix/

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String cur = strs[i];
            for (int j = prefix.length() - 1; j >= 0; j--) {
                if (cur.startsWith(prefix)) {
                    break;
                }
                prefix = prefix.substring(0, j);
            }
        }
        return prefix;
    }
}
