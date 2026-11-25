package arrays;

/*
 * Problem: Plus One (LeetCode #66) - Easy
 * Link: https://leetcode.com/problems/plus-one/
 * Approach: The number is stored as an array of digits, most significant
 *           digit first. Start from the last digit and move left.
 *           If the digit is less than 9, add 1 and return right away.
 *           If the digit is 9, it becomes 0 and the carry moves left.
 *           If every digit was 9 (like 999), create a new array with one
 *           extra digit: 1 followed by all zeros (1000).
 */
import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3}))); // [1, 2, 4]
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9}))); // [1, 0, 0, 0]
    }
}
