package Basic;

import java.util.Scanner;

public class StringWithoutVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence");
        String s = sc.nextLine();
        String line = s.toUpperCase();
        String vowel = "";
        for(int i=0;i<line.length();i++)
        {
            if(line.charAt(i)=='A'||line.charAt(i)=='E'||line.charAt(i)=='I'||line.charAt(i)=='O'||line.charAt(i)=='U')
            {
               continue;
            }
            else
            {
                vowel= vowel+ line.charAt(i);
            }
        }
        System.out.println("The given string without vowels will be :" + vowel);
    }
}
