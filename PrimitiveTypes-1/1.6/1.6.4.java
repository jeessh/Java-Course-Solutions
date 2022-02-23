import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double myDouble;
        System.out.print("Enter a double variable: ");
        myDouble = input.nextDouble();
        
        int newInt = (int) myDouble;
        
        System.out.print("New int value: " + newInt);
    }
}

//Asks the user for a double variable called myDouble 
//with a decimal value
//Casts the double value to an int
//Prints the int value to the screen
