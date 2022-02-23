import java.util.*;

public class BinarySearchTest {

    static int count;

    public static void main(String[] args) {
        
        // Use the helper code to generate arrays, calculate the max
        // iterations, and then find the actual iterations for a randomly
        // selected value.
        
        System.out.println("Array Size: 100");
        System.out.println("Max iterations: " + binaryMax(100));
        System.out.println("Actual iterations: " + binaryRec(generateArrayOfLength(100), 2, 0, 99));
        
        System.out.println("Array Size: 1000");
        System.out.println("Max iterations: " + binaryMax(1000));
        System.out.println("Actual iterations: " + binaryRec(generateArrayOfLength(1000), 2, 0, 999));
        
        System.out.println("Array Size: 10000");
        System.out.println("Max iterations: " + binaryMax(10000));
        System.out.println("Actual iterations: " + binaryRec(generateArrayOfLength(10000), 2, 0, 9999));
        
        System.out.println("Array Size: 100000");
        System.out.println("Max iterations: " + binaryMax(100000));
        System.out.println("Actual iterations: " + binaryRec(generateArrayOfLength(100000), 2, 0, 99999));
 
    }

    public static int binaryRec(int[] array, int target, int begin, int end) {
        if (begin <= end)
        {
        	int mid = (begin + end) / 2;
            count ++;
        	// Base Case
        	if (target == array[mid]) {
        			return mid;
        	}
    
            if (target < array[mid]) {
                return binaryRec(array, target, begin, mid - 1);
            }
    
            if (target > array[mid]) {
                return binaryRec(array, target, mid + 1, end);
            }
        }
		return -1; //Alternate Base Case - not found
    }

    public static int[] generateArrayOfLength(int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int)(Math.random() * 100);
        }

        Arrays.sort(arr);

        return arr;
    }

    private static int binaryMax(int length) {
        return (int) (Math.log(length) / Math.log(2)) + 1;
    }
}
