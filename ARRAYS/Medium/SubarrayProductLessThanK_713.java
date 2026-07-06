package ARRAYS.Medium;

import java.util.Scanner;

public class SubarrayProductLessThanK_713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");

        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int count = numSubarrayProductLessThanK(nums, k);
        System.out.println("Number of subarrays with product less than " + k + ": " + count);
        sc.close(); 
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k){
        if(k <=1){
            return 0;
        }

        int left = 0;
        int product=1;
        int count =0;

        for(int i=0;i<nums.length;i++){
            product *= nums[i];

            while(product >= k){
                product /=  nums[left];
                left++;
            }
            count += (i-left)+1;
        }
        return count;
    }
}
