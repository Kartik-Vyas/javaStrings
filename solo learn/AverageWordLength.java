import java.util.Scanner;
public class AverageWordLength
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();
        String [] s = input.split(" ");
        int words = s.length;
        // here we are using split method to get words also the original strings contains letter plus spaces hence removing spaces we will get letter's length.Now for words space in between them will be words - 1.
        int letters = input.length()-words+1;
        int output = (int) Math.ceil(letters/words);
        System.out.println(output );
    }
}
