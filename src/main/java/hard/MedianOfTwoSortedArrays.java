package hard;

//    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//    The overall run time complexity should be O(log (m+n)).
//    Link: https://leetcode.com/problems/median-of-two-sorted-arrays/

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        if (nums1.length < 1) {
//            return oneArrMedian(nums2);
//        } else return oneArrMedian(nums1);
        return 0.0;

        // TODO: 9/1/21 tried one day ago, I should come back to this later
    }

    public double oneArrMedian(int[] nums) {
        if ((nums.length % 2) == 0) {
            int round = nums.length/2;
            return (double)(nums[round - 1] + nums[round]) / 2;
        }
        return nums[nums.length / 2];
    }
}
