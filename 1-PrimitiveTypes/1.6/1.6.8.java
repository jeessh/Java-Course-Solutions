import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double movieRating;
        
        System.out.println("Enter movie rating:");
        movieRating = input.nextDouble();
        
        int newRating = (int)(movieRating + 0.5);
        
        System.out.print("Rating rounded: " + newRating);
       
    }
}
