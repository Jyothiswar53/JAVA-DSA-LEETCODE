package ARRAYS;

import java.util.Scanner;

public class SquaresOfSortedArray_977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter sorted array:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = sortedSquares(nums);
        System.out.println("Sorted Squares:");

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }

    private static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] result = new int[n];

        int left =0, right= n-1;
        int index = n-1;

        while(left <= right){
            int leftSqu =nums[left] * nums[left];
            int rightSqu =nums[right] * nums[right];

            if(leftSqu > rightSqu){
                result[index]=leftSqu;
                left--;
            }else{
                result[right]= rightSqu;
                right--;
            }
            index--;
        }
        return result;
    }
}
