package medium;

//    Given a string s, find the length of the longest substring t that contains
//    at most 2 distinct characters
//    Link: https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringAtMostTwoDistinctChars {
    public int lengthOfSubString(String str) {
        if (str == null || str.isEmpty()) return 0;
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();

        while (right < str.length()) {
            Character rightChar = str.charAt(right);

            if (!map.containsKey(rightChar) && map.size() == 2) {
                left = map.remove(str.charAt(left)) + 1;
            }
            else {
                map.put(rightChar, right);
                right++;
                max = Math.max(max, right - left);
            }
        }

        return max;
    }
}
