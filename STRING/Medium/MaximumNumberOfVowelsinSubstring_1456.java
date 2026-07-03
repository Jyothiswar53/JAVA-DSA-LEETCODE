package STRING.Medium;

import java.util.Scanner;

public class MaximumNumberOfVowelsinSubstring_1456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Maximum number of vowels: " + maxVowels(s, k));
        sc.close();
    }
    public static int maxVowels(String s, int k){
        int currCount=0;
        int maxCount=0;

        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                currCount++;
            }
        }

        maxCount = currCount;

        for (int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                currCount++;
            }
            if(isVowel(s.charAt(i-k))){
                currCount--;
            }
            maxCount = Math.max(maxCount, currCount);
        }
        return maxCount;
    }
    public static boolean isVowel(char c){
        if(c=='a' || c== 'e' || c=='i' || c=='o' ||c=='u'){
            return true;
        }
        return false;
    }
}
