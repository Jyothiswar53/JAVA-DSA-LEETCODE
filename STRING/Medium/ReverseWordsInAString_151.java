package STRING.Medium;

import java.util.Scanner;

public class ReverseWordsInAString_151 {
    public static String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);

            if (i > 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Reversed words: " + reverseWords(s));

        sc.close();
    }
}
