package ARRAYS.Medium;

// import java.util.Scanner;

// public class FirstLastPositionElementSortedArray_34 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         System.out.println("Enter sorted elements:");
//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         System.out.print("Enter target: ");
//         int target = sc.nextInt();

//         Solution sol = new Solution();
//         int[] result = sol.searchRange(nums, target);
//         System.out.println("First and Last Position of Target: [" + result[0] + ", " + result[1] + "]");
//         sc.close();
//     }

// }

// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int first = firstIndex(nums, target);
//         int last = lastIndex(nums, target);
//         return new int[] { first, last };
//     }

//     public int firstIndex(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1;
//         int index = -1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (nums[mid] == target) {
//                 index = mid;
//                 right = mid - 1;
//             } else if (nums[mid] > target) {
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }
//         return index;
//     }

//     public int lastIndex(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1;
//         int index = -1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (nums[mid] == target) {
//                 index = mid;
//                 left = mid + 1;
//             } else if (nums[mid] > target) {
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }
//         return index;
//     }

// }

import java.util.Scanner;

public class FirstLastPositionElementSortedArray_34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target element:");
        int target = sc.nextInt();

        int firstIndex = firstIndex(nums, target);
        int lastIndex = lastIndex(nums, target);

        System.out.println("First Position: " + firstIndex);
        System.out.println("Last Position: " + lastIndex);
        sc.close();

    }

    private static int lastIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int ans=-1;

        while(low <= high){
            int mid=low + (high - low) / 2;

            if(nums[mid]==target){
                ans =mid;
                low = mid+1;
            }else if(nums[mid] <target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    private static int firstIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}