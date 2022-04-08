import java.util.Scanner;
public class DejaVu
{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
int [] arr = new int[127];
for(int i =0; i<s.length();i++)
{
    arr[s.charAt(i)] = arr[s.charAt(i)] +1;
}
int max = 0;
for(int i =0;i<s.length();i++)
{
    if(max < arr[s.charAt(i)])
    max = arr[s.charAt(i)];
}
if(max > 1)
{
    System.out.println("Deja Vu");
}
else
{
    System.out.println("Unique");
}
}
}
