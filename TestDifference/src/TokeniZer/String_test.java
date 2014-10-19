/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TokeniZer;

/**
 *
 * @author Manjeet Kumar
 */
import java.util.*;
public class String_test {
      private static String deDup(String s) {
     s=s.replaceAll(",",";");
    return new LinkedHashSet<String>(Arrays.asList(s.split(";"))).toString().replaceAll("(^\\[|\\]$)", "").replace(", ", ";");
}
    public static void main(String [] args)
{
    LinkedHashSet ls=new LinkedHashSet();
    
  // String testComma="1,2,3;4;6;mo,jkl12;12";
   //testComma.replace("/[,;]$/", ";");System.out.println(testComma);
  
  // String two1="2812|2812|2771|";
   
  // String[] myStringArray = {"a","b","c"};
  //TEST1: =====================================================================================================
   String emailAddress ="manjeet@birchstreet.net,manjeet@birchstreet.net;manjeet@birchstreet.net,manjeet@gdiindia.com;manjeet@birchstreet.net;manjeet@gdiindia.com,manjeet@gdiinda.com;manjeet@gdiinda.com,manjeet@gdiinda.com,manjeet@gdiinda.com,"
           + "acvcgh@nananah.com;manjeet@birchstreet.net,manjeet@birchstreet.net;manjeet@birchstreet.net";
   //String one="10,9,12,4,14,13,12,12,4,4,13,13";
   //one=one.split("\\s*,\\s*").toString().replace(",", ";");
   //one=one.replaceAll(",",";").replace(";", "|");
   //List<String> items = Arrays.asList(one.split("\\s*,\\s*"));
   //System.out.println("ITEMS=="+items);
  System.out.println(deDup(emailAddress));
   //String e=Arrays.asList(emailAddress.split("\\s*,\\s*"));
   
   
   
   //System.out.println(deDup(emailAddress));

   //System.out.println(one);
   
   
   System.out.println("***************************************************************************************");
}
}
