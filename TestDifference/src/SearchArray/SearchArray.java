/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchArray;

/**
 *
 * @author Manjeet Kumar
 */
import java.util.*;
import java.io.*;

public class SearchArray{
  public static void main(String[] args) throws IOException{
  int n = 0;
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("How many elements you want to enter into the array : ");
  try{
  n = Integer.parseInt(in.readLine());
  }
  catch(NumberFormatException ne){
  System.out.println(ne.getMessage() + " is not a legal value.");
  System.out.println("Please enter a numeric value.");
  System.exit(1);
  }
  String[] names = new String[n];
  System.out.print("Enter value for the array : ");
  for(int i = 0; i < n; i++){
  names[i] = in.readLine();
  }
  Arrays.sort(names);
  System.out.println("Elements of the array in ascending order : ");
  for(int i = 0; i < names.length; i++){
  System.out.println(names[i]);
  }
  System.out.print("Enter the string for search in the array : ");
  int position = Arrays.binarySearch(names, in.readLine());
  if(position < 0 || position > n-1){
  System.out.println("Given word is not available in the array.");
  System.exit(1);
  }
  else{
  System.out.println("\"" + names[position] + "\" is available in the array at position " + (position + 1) +".");
  }
  }
}