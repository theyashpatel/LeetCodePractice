package medium;

//    Given an array of positive integers nums and a positive integer target,
//    return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which
//    the sum is greater than or equal to target. If there is no such subarray, return 0 instead.
//    Follow up: If you have figured out the O(n) solution,
//    try coding another solution of which the time complexity is O(n log(n)).
//
//    Link: https://leetcode.com/problems/minimum-size-subarray-sum/

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while (right < nums.length) {
            sum += nums[right++];
            while (sum >= target) {
                min = Math.min(min, right - left);
                sum -= nums[left++];
            }
        }
        return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}
