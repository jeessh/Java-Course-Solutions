import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String nameAuthor;
        String nameBook;
        String namePublisher;
        int year;
        
        System.out.println("Enter the author's name as 'Last name, First name': ");
        nameAuthor = input.nextLine();
        
        System.out.println("Enter the title of the book: ");
        nameBook = input.nextLine();
        
        System.out.println("Enter the publisher of the book: ");
        namePublisher = input.nextLine();
        
        System.out.println("Enter the year the book was published: ");
        year = input.nextInt();
        
        System.out.println(nameAuthor + ". " + nameBook + ".");
        System.out.print(namePublisher + ", " + year + ".");
        
        
    }
}
