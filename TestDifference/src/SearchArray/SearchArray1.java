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
public class SearchArray1 {
     public static void main(String[] argv) {
         String[] sortedArray = new String[] { "aam", "bomb", "bomb", "dumb","bomb","aam","jang","jang","bomb","jang","ram","ram","neha","raina","neha","raina"};
          String fieldNameArray[]=new String[10];
       
         for(int i=0;i<fieldNameArray.length;i++){
             if (Arrays.asList(fieldNameArray).contains("jang")) {
                 continue;
             } else {
                 System.out.println(sortedArray[i]);
             }
fieldNameArray[i]=sortedArray[i];
         }
     }
}
