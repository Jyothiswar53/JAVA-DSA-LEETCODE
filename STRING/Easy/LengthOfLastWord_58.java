package STRING.Easy;

import java.util.Scanner;

public class LengthOfLastWord_58 {

    public static int lengthOfLastWord(String s) {

        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        int result = lengthOfLastWord(input);

        System.out.println("Length of Last Word: " + result);

        sc.close();
    }
}
