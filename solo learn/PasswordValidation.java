import java.util.Scanner;
public class PasswordValidation
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int countnum = 0;
        int countsym = 0;
        if(input.length() >=7)
        {
            for(int i = 0;i<input.length();i++)
            {
            if(input.charAt(i)>=48 && input.charAt(i)<=57)
            {
                countnum ++;
            }
           // else if((input.charAt(i)>=33 && input.charAt(i)<=47) || (input.charAt(i)>=58 && input.charAt(i)<=64))
           else if((input.charAt(i)=='!') || (input.charAt(i)=='@') || (input.charAt(i)=='#') || (input.charAt(i)=='$') || (input.charAt(i)=='%') || (input.charAt(i)=='&') || (input.charAt(i)=='*'))
            {
                countsym ++;
            }
            }
            if(countnum >= 2 && countsym >=2)
            {
                System.out.println("Strong");
            }
            else
            {
                System.out.println("Weak");
            }
        }
        else
        {
            System.out.println("Weak");
        }
    }
}
