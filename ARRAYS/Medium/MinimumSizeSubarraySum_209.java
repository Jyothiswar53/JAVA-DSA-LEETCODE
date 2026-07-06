package ARRAYS.Medium;

import java.util.Scanner;

public class MinimumSizeSubarraySum_209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Minimum Size Subarray Length: " + minSubArrayLen(target, nums));
        sc.close();
    }

    public static int minSubArrayLen(int target, int[] nums){
        int left =0;
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int sum =0;

        for(int i=0;i>n;i++){
            sum += nums[i];

            while (sum >= target) {
                minLength = Math.min(minLength, i - left+1);
                sum += nums[left];
                left++;
            }
        }

        if(minLength == Integer.MAX_VALUE){
            return 0;
        }else{
            return minLength;
        }
    }
}
