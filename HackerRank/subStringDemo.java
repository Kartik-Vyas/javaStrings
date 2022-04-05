import java.io.*;
import java.util.*;

public class subStringDemo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int firstChar = sc.nextInt();
    int secondChar = sc.nextInt();
    System.out.println(input.substring(firstChar,secondChar));
    }
}
