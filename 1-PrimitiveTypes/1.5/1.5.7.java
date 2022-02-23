import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
            
            double dinner;
            double golf;
            double dessert;
            
            System.out.println("How much did dinner cost?");
            dinner = input.nextDouble();
            
            input.nextLine();
            
            System.out.println("How much is mini-golf for one person?");
            golf = input.nextDouble();
            
            input.nextLine();
            
            System.out.println("How much did dessert cost?");
            dessert = input.nextDouble();
            
            System.out.print("Dinner: $");
            System.out.println(dinner);
            
            System.out.print("Mini-Golf: $");
            System.out.println(golf);
            
            System.out.print("Dessert: $");
            System.out.println(dessert);
            
            double grandTotal = dinner + golf *2 + dessert;
            
            System.out.print("Grand Total: $");
            System.out.println(grandTotal);
    }
}
