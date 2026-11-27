package arrays;


/*
 * Problem: Find the Second Largest Element in an Array (Easy)
 *
 * Question:
 *   Given an array of integers, find the second largest distinct element.
 *   If there is no second largest element, return -1.
 */
public class SecondLargestElement {

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{12, 35, 1, 10, 34, 1}));
    }
}
