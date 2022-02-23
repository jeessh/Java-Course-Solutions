import java.util.ArrayList;

public class Numbers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        num.add(6);
        num.add(5);
        num.add(4);
        num.add(3);
        num.add(2);
        num.add(1);

}
 public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr)
 {
    
    int currentMinIndex;
    int counter = 0;
    for (int i = 0; i < arr.size() - 1; i++)
    {
      currentMinIndex = i;
        for (int j = i + 1; j < arr.size(); j++)
        {
            if(arr.get(j) < arr.get(currentMinIndex))
            {
                currentMinIndex = j;
            }
        }
        if (i != currentMinIndex)
        {
            int temp = arr.get(currentMinIndex);
            arr.set(currentMinIndex, arr.get(i));
            arr.set(i, temp); //Line 19
            counter++;
            
        }
        
    }

    return arr;
    
 }
}
