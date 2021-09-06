package easy;

//    An array is monotonic if it is either monotone increasing or monotone decreasing.
//    An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
//    An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
//    Given an integer array nums, return true if the given array is monotonic, or false otherwise.
//    Link: https://leetcode.com/problems/monotonic-array/
//    Constraints:
//
//        1 <= nums.length <= 105
//        -105 <= nums[i] <= 105

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) isDecreasing = false;
            if (nums[i + 1] < nums[i]) isIncreasing = false;
        }
        return isIncreasing || isDecreasing;
    }
}
