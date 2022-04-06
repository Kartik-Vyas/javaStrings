import java.io.*;
import java.util.*;

public class frequencyOfChar {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int [] arr1 = new int[127];
        int [] arr2 = new int[127]; 
        for(int i =0;i<a.length();i++)
        {
            arr1[a.charAt(i)] = arr1[a.charAt(i)]+1; 
        }
        
        for(int i =0;i<b.length();i++)
        {
            arr2[b.charAt(i)] = arr2[b.charAt(i)]+1; 
        }
        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("Anagrams");
        }else
        {
            System.out.println("Not Anagrams");
        }
    }
}
