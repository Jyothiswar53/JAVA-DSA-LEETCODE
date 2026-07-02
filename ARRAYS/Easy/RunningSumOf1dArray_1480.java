package ARRAYS.Easy;

import java.util.Scanner;

public class RunningSumOf1dArray_1480 {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = runningSum(nums);

        System.out.print("Running Sum: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
