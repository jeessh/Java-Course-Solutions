import java.util.ArrayList;

public class DataPurgeTester
{
    public static void main(String[] args)
    {
        ArrayList<String> emails = new ArrayList<String>();
        addEmails(emails);
        System.out.println("List is all emails: " +DataPurge.containsOnlyEmails(emails));
        DataPurge.removeAOL(emails);
        DataPurge.removeDuplicates(emails);
        System.out.println(emails);
    }
    
    
    
    public static void addEmails(ArrayList<String> emails)
    {
        emails.add("jesshuang5733@gmail.com");
        emails.add("alanwang12@icloud.com");
        emails.add("jesse123@gmail.com");
        emails.add("chunkysoup@hotmail.com");

    }
}
