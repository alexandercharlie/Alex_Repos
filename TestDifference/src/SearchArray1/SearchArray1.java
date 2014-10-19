/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchArray1;

/**
 *
 * @author Manjeet Kumar
 */
import java.util.*;

public class SearchArray1 {

    public static void main(String args[]) throws Exception {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};


        int test[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int searchTest = Arrays.binarySearch(test, 9);
        int searchTest1 = Arrays.binarySearch(test, 2);
        int searchTest2 = Arrays.hashCode(test);
        String searchTest3 = Arrays.toString(test);
        



        System.out.println("Search Success: Found " + searchTest);//+" at "+test.length
        System.out.println("Search Success: Found " + searchTest1);
        System.out.println("Hash Code: " + searchTest2);
        System.out.println("Returns Array: " + searchTest3);

        
        //testing search
          String[] sortedArray = new String[] { "a", "b", "c", "d" };

    int indexes = Arrays.binarySearch(sortedArray, "c");

    indexes = Arrays.binarySearch(sortedArray, "e");

    int[] sortedIntArray = new int[] { 1, 2, 3, 5, 7 };

    indexes = Arrays.binarySearch(sortedIntArray, 6);
        // Ensure array sorted
        Arrays.sort(array);
        printArray("Sorted array", array);

        // Search for element in array
        int indexes1 = Arrays.binarySearch(array, 2);
        System.out.println("Found 2 @ =" + indexes1);

        // Search for element not in array
        indexes1 = Arrays.binarySearch(array, 1);
        System.out.println("Didn't find 1 @ =" + indexes1);

        // Insert
        int newIndex = -indexes - 1;
        array = insertElement(array, 1, newIndex);
        printArray("With 1 added", array);

    }

    private static void printArray(String message, int array[]) {
        System.out.println(message + ": [length: " + array.length + "]");
        // Print out sorted array elements
        for (int i = 0, n = array.length; i < n; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static int[] insertElement(int original[], int element, int index) {
        int length = original.length;
        int destination[] = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(original, index, destination, index + 1, length - index);
        return destination;
    }
}