/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchArray2;

/**
 *
 * @author Manjeet Kumar
 */
import java.util.Arrays;

public class SearchArray2 {

  public static void main(String[] argv) {
    String[] sortedArray = new String[] { "a", "b", "c", "d" };

    int indexC = Arrays.binarySearch(sortedArray, "c");
    System.out.println("Found C at:"+indexC);

    int indexE = Arrays.binarySearch(sortedArray, "d");
System.out.println("Found E at:"+indexE);

    int[] sortedIntArray = new int[] { 1, 2, 3, 5, 7 };

    int index6 = Arrays.binarySearch(sortedIntArray, 3);
  System.out.println("Found 6 at:"+index6);

  }
}    
