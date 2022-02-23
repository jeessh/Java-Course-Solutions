public class AddFractions 
{
    public static void main(String[] args)
    {
        int num1 = 1;
        int den1 = 2;
        
        int num2 = 2;
        int den2 = 5;
        

        String printFraction1 = num1 + "/" + den1;
        String printFraction2 = num2 + "/" + den2;
        
        int finalNumerator1 = num1 * den2;
        int finalNumerator2 = num2 * den1;
        int finalNumerator = finalNumerator1 + finalNumerator2;
        
        int finalDenominator = den1 * den2;
        

        System.out.print("The numerator of the first fraction is ");
        System.out.println(num1);
        
        System.out.print("The denominator of the first fraction is ");
        System.out.println(den1);
        
        System.out.print("The numerator of the second fraction is ");
        System.out.println(num2);
        
        System.out.print("The denominator of the second fraction is ");
        System.out.println(den2);
        
        System.out.print("The sum of ");
        System.out.print(printFraction1);
        System.out.print(" + ");
        System.out.print(printFraction2);
        System.out.print(" = ");
        System.out.print(finalNumerator + "/" + finalDenominator);
    }
}

//The numerator of the first fraction is 1
//The denominator of the first fraction is 2
//The numerator of the second fraction is 2
//The denominator of the second fraction is 5
//The sum of 1/2 + 2/5 = 9/10
