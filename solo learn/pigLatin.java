import java.util.Scanner;
public class pigLatin
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String[] Splitted = user.split(" ");
        for(int i=0;i<Splitted.length;i++)
        {
           System.out.print((Splitted [i].substring(1) + Splitted[i].substring(0,1)) +"ay" + " ");
        }
        //String s1 = Splitted[0].substring(1) + Splitted[0].substring(0,1);
         //String s2 = Splitted[1].substring(1) + Splitted[1].substring(0,1) ;
         //String s3 = Splitted[2].substring(1) + Splitted[2].substring(0,1) ;
//System.out.print(s1 + "ay" + " ");
//System.out.print(s2 + "ay" + " ");
//System.out.print(s3 + "ay" + " ");
         
    }
}
