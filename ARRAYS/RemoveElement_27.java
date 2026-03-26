package ARRAYS;

import java.util.Scanner;

public class RemoveElement_27 {

    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        RemoveElement_27 solution = new RemoveElement_27();
        int k = solution.removeElement(nums, val);

        System.out.println("Number of elements after removing " + val + ": " + k);

        System.out.print("Array after removing: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}