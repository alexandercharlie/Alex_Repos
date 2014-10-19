/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Passing_Array_As_args;

/**
 *
 * @author Manjeet Kumar
 */
import java.lang.String;
import java.util.*;
import java.text.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;


public class Array_as_args
{
   private static String deDup(String s) {
       s.split("\\s*;\\s*");
    return new LinkedHashSet<String>(Arrays.asList(s.split(","))).toString().replaceAll("(^\\[|\\]$)", "").replace(", ", ";");
}
    public static void main(String [] args)
{
   String testComma="1,2,3;4;6;mo,jkl12;12";
   testComma.replace("/[,;]$/", ";");System.out.println(testComma);
  
   String two1="2812|2812|2771|";
   
   String[] myStringArray = {"a","b","c"};
  //TEST1: =====================================================================================================
   String emailAddress ="manjeet@birchstreet.net,manjeet@gdiindia.com;manjeet@birchstreet.net;manjeet@gdiindia.com,manjeet@gdiinda.com;manjeet@gdiinda.com";
   String one="10,9,12,4,14,13,12,12,4,4,13,13";
   List<String> items = Arrays.asList(one.split("\\s*,\\s*"));
   //System.out.println("ITEMS=="+items);
   System.out.println(deDup(items.toString()));
   //String e=Arrays.asList(emailAddress.split("\\s*,\\s*"));
   //System.out.println(deDup(emailAddress));
System.out.println("***************************************************************************************");
   //TEST2: ====================================================================================================
   List<String> items2 = Arrays.asList(two1.split("\\s*|\\s*"));
   System.out.println(items2);
   int sizearr=items2.size();
   int arr[]=new int[sizearr];
   //arr= (ArrayList) items;
   for(int i=0;i<arr.length;i++)
   {
       System.out.println(items2.get(i));
   }
  //TEST3: ======================================================================================================= 
   //Another Test
   String two="I am a great fundamentalist and purist";
   List<String> lst=Arrays.asList(two.split("\\s*a\\S*"));
   System.out.println(lst);
   int sizearr2=lst.size();
   int arr2[]=new int[sizearr2];
   for(int l=0;l<arr2.length;l++)
   {
       System.out.println(lst.get(l));
   }
   
   int i;
   int quantity[]= {4,8,6,7,9,15,3,5,2,4};
   int size=10;
   double amount []= new double[10];
   double prices []= {10.62, 14.89, 13.21, 16.55, 18.62, 9.47, 6.58, 18.32, 12.15, 3.98};
   
   DecimalFormat num = new DecimalFormat("##.00");
   
   extend(quantity, prices, amount);  //method call
   
   System.out.print(" The value in the quantity array are ");
   System.out.print(" The value in the prices array are ");
   System.out.print(" ");
   
   for(i = 0; i <quantity.length; i++)
   {
	 System.out.print("Enter a quantity " + (i+1) + ":");
	 System.out.println("Amount: " + num.format(amount[i]));
   }
}
   
   public static void extend(int quantity[], double prices[], double amount[])
{
  int i;
  int size=10;
  
  for(i=0; i<size; i++)
  amount[i]= quantity[i] * prices[i];
 }

}


