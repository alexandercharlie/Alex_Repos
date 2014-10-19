/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchArray;

import java.util.Arrays;

/**
 *
 * @author Manjeet Singh
 */
public class SearchingArray {
      public static void main(String[] argv) {
    String[] sortedArray = new String[] { "aam", "bomb", "bomb", "dumb","bomb","aam","jang","jang","bomb","jang","ram","ram","neha","raina","neha","raina"};
    System.out.println();
    String newArray[]=new String[100];//{"comb", "dumb","bomb","aam","gang"};
    System.out.println(sortedArray.length);
    for(int i=0;i<sortedArray.length;i++)
    {
        
        //System.out.println(i+" "+Arrays.asList(sortedArray).contains(newArray[i])); 
        
        if(!Arrays.asList(newArray).contains(sortedArray[i]))
        {
            System.out.println(i+"== "+sortedArray[i]); 
        }
        //int x=Arrays.binarySearch(sortedArray,"aam");
//        if(Arrays.binarySearch(newArray,sortedArray[i])!=-1) 
//        {
//            System.out.println("Allready here: "+sortedArray[i]);
//        }
//        else
//            System.out.println("First Time: "+sortedArray[i]);
    newArray[i]=sortedArray[i];
    }
    
      if(Arrays.asList(sortedArray).contains("hoax"))
        {
            System.out.println("YES"); 
        }
      else
          System.out.println("NO");
  }
}
