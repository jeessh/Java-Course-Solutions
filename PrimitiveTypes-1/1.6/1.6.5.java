import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int int1;
        int int2;
        
          System.out.print("Enter first integer: ");
            int1 = input.nextInt();
        
            input.nextLine();
        
          System.out.print("Enter second integer: ");
            int2 = input.nextInt();
        
        double finalResult;
        
        finalResult = (double) int1 / int2;
        
        System.out.print("Exact result is: " + finalResult);
        

    }
}

//Asks the user for two integers called int1 and int2
//Divides the two ints
//Prints the result
//The trick here is that we want the division of the 
//two ints to result in a double! 
//Casting values to doubles will be necessary to solve this exercise.
