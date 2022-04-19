import java.util.Scanner;
public class AverageWordLengthEfficient
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();
        String [] s = input.split(" ");
        double  words = s.length;
        String letters = "";
        for(int i = 0;i<input.length();i++)
        {
            if((input.charAt(i)>=65 && input.charAt(i)<=90) || (input.charAt(i)>=97 && input.charAt(i)<=122))
            {
                letters = letters + input.charAt(i);
            }
            else
            {
                continue;
            }
        }
        double value = letters.length();
        // here we are using split method to get words also the original strings contains letter plus spaces hence removing spaces we will get letter's length.Now for words space in between them will be words - 1.
        int output = (int) Math.ceil(value/words);
        System.out.println(output );
    }
}
