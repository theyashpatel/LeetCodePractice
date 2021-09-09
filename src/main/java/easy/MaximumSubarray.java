package easy;

// TODO: 9/8/21 do it after a while

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cur = Math.max(cur + nums[i], nums[i]);
            max = Math.max(max, cur);
        }
        return max;
    }
}


//    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum
//    and return its sum.
//    A subarray is a contiguous part of an array.
//
//    Follow up: If you have figured out the O(n) solution,
//    try coding another solution using the divide and conquer approach, which is more subtle.
//
//    Link: https://leetcode.com/problems/maximum-subarray/
