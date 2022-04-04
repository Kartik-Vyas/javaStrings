import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String pali = "";

        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i) == s.charAt(s.length()-1-i))
            {
               pali+=s.charAt(s.length()-1-i);
            }
            else
            {
               // System.out.println("not a palindrome");
                break;
            }
        }
        if(pali.equals(s))
        {
            System.out.println("palindrome");
        }
        else
            System.out.println("not");
       // System.out.println("palindrome");
    }
}
