/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MISC_GetTheAvailaibleProcessor;

/**
 *
 * @author Manjeet Singh
 */
public class GetHeapSize {
    public static void main(String[]args){
         
        //Get the jvm heap size.
        long heapSize = Runtime.getRuntime().totalMemory();
         
        //Print the jvm heap size.
        System.out.println("Heap Size = " + (heapSize/1024)/1024);
    }
}  