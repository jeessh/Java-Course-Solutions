public class LastElement
{
    public static void main(String[] args)
    {
        String[] arr = new String[]{"hello", "my name", "world", "Karel"};
        //get and print the last element of the array
            System.out.println("The last element of the String array is: " + arr[3]);
    }

    public static String getLastElement(String[] arr)
    {
        return arr[3];
        
    }

}
