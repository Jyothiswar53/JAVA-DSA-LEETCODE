package ARRAYS;

import java.util.Scanner;

public class PalindromeNumber_9 {

    public static boolean isPalindrome(int x) {
        int original = x;

        if (x < 0) {
            return false;
        }
        int rev = 0;
        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return rev == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (isPalindrome(x)) {
            System.out.println(x + " is a Palindrome");
        } else {
            System.out.println(x + " is NOT a Palindrome");
        }
        sc.close();
    }
}