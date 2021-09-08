package easy;

//    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//    Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
//    Link: https://leetcode.com/problems/valid-anagram/

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int[] alphabets = new int[26];

        for (int i = 0; i < sc.length; ++i) {
            alphabets[sc[i] - 'a']++;
            alphabets[tc[i] - 'a']--;
        }
        for (int i : alphabets) {
            if (i != 0) return false;
        }
        return true;
    }
}
