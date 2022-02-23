import java.util.ArrayList;
public class Phonebook 
{
    
    ArrayList<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();

    public void addNumber(PhoneNumber p)
    {
        phoneNumbers.add(p);
        sort();
    }
    public void sort()
    {
        for(int i = 0; i < phoneNumbers.size(); i++)
        {
            for(int j = 0; j < phoneNumbers.size()-1; j++)
            {
                if(phoneNumbers.get(j).getName().compareTo(phoneNumbers.get(j+1).getName()) > 0)
                {
                    PhoneNumber temp =  phoneNumbers.get(j);
                    phoneNumbers.set(j, phoneNumbers.get(j+1));
                    phoneNumbers.set(j+1, temp);  
                }
            }   
        }
    }
    
    public void printPhoneBook()
    {
        for(int i = 0; i < phoneNumbers.size(); i++)
        {
            System.out.println(phoneNumbers.get(i).getName());
        }
    }
}
