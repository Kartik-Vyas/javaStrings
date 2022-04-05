import java.util.Scanner;

public class PalindromePerface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int flag = 0;
        int value =s.length()%2;
        if(value==0)
        {
            for(int i = 0;i <s.length()/2;i++)
            {
                if(s.charAt(i)==(s.charAt(s.length()-1-i)))
                {
                    flag = 1;
                    continue;
                }
                else {
                    flag = 0;
                    break;
                }
            }
        }
        if(value!=0) {
            for (int i = 0; i < s.length() / 2 - 1; i++) {
                if (s.charAt(i) == (s.charAt(s.length() - 1 - i))) {
                    flag = 1;
                    continue;
                } else {
                    flag = 0;
                    break;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
