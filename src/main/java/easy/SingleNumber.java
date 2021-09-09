package easy;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Link: https://leetcode.com/problems/single-number/

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i: nums) {
            res ^= i;
        }
        return res;
    }
}
