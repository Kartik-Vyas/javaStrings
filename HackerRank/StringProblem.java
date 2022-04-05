import java.io.*;
import java.util.*;

public class StringProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = s1+s2;
        System.out.println(s3.length());
        int value =s1.compareTo(s2);
        if(value>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        System.out.print(s1.substring(0,1).toUpperCase()+s1.substring(1) + " ");
        System.out.print(s2.substring(0,1).toUpperCase()+s2.substring(1));
    }
}
