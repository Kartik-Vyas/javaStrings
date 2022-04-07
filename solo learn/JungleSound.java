import java.util.Scanner;
public class JungleSound
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   String sound = sc.nextLine();
String [] soundArr = sound.split(" ");
for(int i = 0;i<soundArr.length;i++)
{
    if(soundArr[i].equals("Grr"))
    {
        System.out.print("Lion" + " ");
    }
    else if(soundArr[i].equals("Rawr"))
    {
        System.out.print("Tiger" + " ");
    }
    else if(soundArr[i].equals("Ssss"))
    {
        System.out.print("Snake" + " ");
    }
    else if(soundArr[i].equals("Chirp"))
    {
        System.out.print("Bird" + " ");
    }
    else 
    continue ;
    
}
}
}
