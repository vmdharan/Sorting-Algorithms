import java.util.Arrays;

// Main class for the running the sorting algorithms.
public class SortMain
{
    public static void main(String args[])
    {
        int testArray[] = { 4, 2, 1, 7, 3, 6, 5, 9, 0, 8, 7, 4, 3, 10 };
        
        // Print out test array.
        System.out.println("Original data:");
        System.out.println(Arrays.toString(testArray));
        System.out.println("\n");
        
        // Print out sorted array.
        BubbleSort bs1 = new BubbleSort(testArray);
        System.out.println("Sorting using BubbleSort:");
        System.out.println(Arrays.toString(bs1.sort()));
    }
}