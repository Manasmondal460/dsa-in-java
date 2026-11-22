/*
 * Problem: Product of Array Except Self (LeetCode #238) - Medium
 * Link: https://leetcode.com/problems/product-of-array-except-self/
 * Approach: Build prefix products from the left, then multiply by suffix
 *           products while traversing from the right.
 * Time: O(n) | Space: O(1) extra (excluding the output array)
 */
package arrays;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // res[i] holds the product of all elements to the left of i
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // Multiply by the product of all elements to the right of i
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ans = productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ans)); // [24, 12, 8, 6]
    }
}
