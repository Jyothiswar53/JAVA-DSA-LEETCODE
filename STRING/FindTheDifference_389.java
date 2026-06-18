package STRING;

import java.util.Scanner;

public class FindTheDifference_389 {
    public static char findTheDifference(String s, String t) {
        int sum = 0;

        for (int i = 0; i < t.length(); i++) {
            sum += t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            sum -= s.charAt(i);
        }
        return (char) sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter second string: ");
        String t = sc.nextLine();

        System.out.println("Extra character: " + findTheDifference(s, t));

        sc.close();
    }
}
