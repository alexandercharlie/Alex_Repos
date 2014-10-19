/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiDimensionalArray;

/**
 *
 * @author Manjeet Singh
 */
import java.util.Scanner;

public class ThreeDimensionalArray {
   public static void main(String args[]) {

       Scanner input = new Scanner(System.in);
  
       int threeDArray[][][] = new int[10][10][10];
       int i = 0, j = 0, k = 0;
  
       System.out.print("Enter the value of i : "); 
       i = input.nextInt();

       System.out.print("Enter the value of j : "); 
       j = input.nextInt();
        
       System.out.print("Enter the value of k : "); 
       k = input.nextInt();
  
       System.out.println("");
  
       for(int m=0; m < i; m++) 
  for(int n=0; n < j; n++)
    for(int p=0; p < k; p++)
      threeDArray[m][n][p] = m * n * p;

       for(int m=0; m < i; m++) {
  for(int n=0; n < j; n++) {
    for(int p=0; p < k; p++) 
      System.out.print(threeDArray[m][n][p] + " "); 
    System.out.println();
  }
  System.out.println();
  }
       }
}