/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AverageValueOfArray;

import java.util.Arrays;

/**
 *
 * @author Manjeet Kumar
 */
public class AverageValueOfArray {

    public static void main(String[] args) {
        double num[] = new double[]{10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        double sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        double average = sum / num.length;
  
    //2. Average value of array    
    System.out.println("Average Value of Array is=" + average);
    System.out.println("Java String Array Length");
    String str[]=new String[]{"hello","bebo","lampoon","shampoo"};
    int length=str.length;
    System.out.println("Length of Array is="+length);
    //print elements of array
    for(int e=0;e<length;e++)
        System.out.println("Elements="+str[e]);
    
    //3. Java Array to String
    System.out.println("Java Array to String Example");
    String strR[]=new String[]{"Since","eternity","i","wanted","to","tell","you","this"};
    //Array to String
    String str1=Arrays.toString(strR);
    //Replace Starting [,] and ,
    str1=str1.substring(1,str1.length()-1).replaceAll(",","");
    
    String str2=Arrays.asList(strR).toString();
    str2=str2.substring(1,str2.length()-1).replaceAll(",","");
    System.out.println("String2="+str2);
    
    StringBuffer sbf=new StringBuffer();
    
    if(strR.length>0)
    {
        sbf.append(strR[0]);
        for(int i=0;i<strR.length;i++)
        {
            sbf.append(" ").append(strR[i]);
        }
    }
    System.out.println("String 3: "+sbf.toString());
    }
}
