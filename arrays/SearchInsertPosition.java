package arrays;

/*
 * Problem: Search Insert Position (LeetCode #35) - Easy
 * Link: https://leetcode.com/problems/search-insert-position/
 * Approach: The array is sorted, so use Binary Search. Compare the middle
 *           element with the target and discard half of the array each step.
 *           If the target is not found, 'left' ends up at the correct
 *           insert position.
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5)); // 2
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2)); // 1
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7)); // 4
    }
}
