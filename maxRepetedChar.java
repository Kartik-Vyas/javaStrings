package vyas.strings;
import java.util.Scanner;
public class maxRepetedChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        String s = "55555";
        int [] arrs = new int[127];
        for(int i = 0;i<s.length();i++)
        {
            arrs[s.charAt(i)] = arrs[s.charAt(i)]+1;
        }
        int max = 0;
        char c = ' ';
        for (int i =0;i<s.length();i++)
        {
            if(max< arrs[s.charAt(i)])
            {
                max = arrs[s.charAt(i)];
                c =s.charAt(i);
            }
        }
        System.out.println(c);
    }
}
