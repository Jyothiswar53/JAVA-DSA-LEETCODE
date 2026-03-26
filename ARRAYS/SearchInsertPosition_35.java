package ARRAYS;

import java.util.Scanner;

public class SearchInsertPosition_35 {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (target < nums[mid]) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        SearchInsertPosition_35 obj = new SearchInsertPosition_35();
        int result = obj.searchInsert(nums, target);

        System.out.println("Position: " + result);

        sc.close();
    }
}