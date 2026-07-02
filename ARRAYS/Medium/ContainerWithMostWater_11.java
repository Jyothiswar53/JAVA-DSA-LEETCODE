package ARRAYS.Medium;

import java.util.Scanner;

public class ContainerWithMostWater_11 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] height = new int[n];
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        int result = maxArea(height);
        System.out.println("Maximum area of water that can be contained: " + result);
        sc.close();
    }

    private static int maxArea(int[] height) {
        int left = 0;
        int n= height.length;
        int right = n-1;
        int maxArea = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = minHeight * width;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }  
}
