package MATRIX;

import java.util.Scanner;

public class RichestCustomerWealth_1672 {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of banks: ");
        int cols = sc.nextInt();

        int[][] accounts = new int[rows][cols];

        System.out.println("Enter the account balances:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }
        System.out.println("Maximum Wealth: " + maximumWealth(accounts));

        sc.close();
    }
}
