package STRING.Easy;

import java.util.Scanner;

public class ExcelSheetColumnNumber_171 {
    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Excel column title: ");
        String columnTitle = sc.nextLine();

        System.out.println("Column number: " + titleToNumber(columnTitle));

        sc.close();
    }
}
