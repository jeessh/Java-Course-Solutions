import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
       // Start here
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please enter a number to start:");
       int num = input.nextInt();
       System.out.println(countdown(num));
       
    }
    
    public static String countdown(int number)
    {
       
       // Base case - return Blastoff!
       if(number == 0)
       {
           return "Blastoff!";
       }
       // Recursive call
       else
       {
           return number + " " + countdown(number - 1);
       }
    }
}
