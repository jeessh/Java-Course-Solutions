public class WorkShift
{
    public static void main(String[] args)
    {
        int s = 16;
        
        int h = 20;
        h *= 3600;
        
        int m = 42;
        m *= 60;
        
        int shiftTime = h + m + s;
        
        System.out.print("Total shift time is: ");
        System.out.print(shiftTime);
        System.out.print(" s");
    }
}

//A doctor works 20 hours, 42 minutes, and 16 seconds in one shift at a hospital. 
//Convert the total shift time into seconds and display that information.
