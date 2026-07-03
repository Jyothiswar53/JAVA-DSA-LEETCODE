package STRING.Easy;

import java.util.Scanner;

public class RansomNote_383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            count[c - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ransom note: ");
        String ransomNote = sc.nextLine();

        System.out.print("Enter magazine string: ");
        String magazine = sc.nextLine();

        System.out.println("Can construct: " + canConstruct(ransomNote, magazine));

        sc.close();
    }
}
