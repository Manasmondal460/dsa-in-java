package arrays;

/*
 * Problem: Merge Sorted Array (LeetCode #88) - Easy
 * Link: https://leetcode.com/problems/merge-sorted-array/
 * Approach: Both arrays are sorted, and nums1 has empty space at the end.
 *           Merging from the front would overwrite elements of nums1, so
 *           merge from the BACK and place the largest element first.
 *           i points to the last real element of nums1, j points to the
 *           last element of nums2, and k points to the last position of
 *           nums1. Compare nums1[i] and nums2[j], put the larger one at
 *           nums1[k], and move the pointers. When nums2 is finished, the
 *           remaining elements of nums1 are already in place.
 */
import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1)); // [1, 2, 2, 3, 5, 6]
    }
}

