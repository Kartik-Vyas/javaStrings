import java.util.Scanner;
public class TheSpyLife
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String s = "";
        for (int i=0;i<user.length();i++)
        {
            if(((user.charAt(i)>=65) && (user.charAt(i)<=90)) || ((user.charAt(i)>=97) && (user.charAt(i)<=122)) || ((user.charAt(i)==32)))
            s = s + user.charAt(i);
        }
        String rev = "";
        for(int i = s.length() -1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);
    }
}
