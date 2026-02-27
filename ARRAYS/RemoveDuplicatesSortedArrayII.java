package ARRAYS;

import java.util.Scanner;

public class RemoveDuplicatesSortedArrayII {

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}