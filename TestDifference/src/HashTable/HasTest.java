/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

import java.util.Hashtable;

/**
 *
 * @author Manjeet Singh
 */
public class HasTest {
        public static void main(String[] args)
{
    Hashtable ht=new Hashtable();
    ht.put("ONE","one-one");
    ht.put("TWO","two-two");
    ht.put("THREE","0.123");
    ht.put("FOUR","");
    ht.put("FIVE","10.0");
    String one="0.0";
    String two="0.0";
    String three="0.0";
    
    if(ht.size()>0)
    {
        one=(String)ht.get("THREE");
         double num1=0.0;
         String four="0.0";
         four=(String)ht.get("FOUR");
          // if(!((String)ht.get("FOUR")).equals("")){
        num1=Double.parseDouble(four);
        System.out.println("num1==== "+num1);
           //}
        double num2=Double.parseDouble((String)ht.get("FIVE"));
        //System.out.println("MULTIPLICATION TEST: "+Double.parseDouble((String)ht.get("FOUR"))*Double.parseDouble((String)ht.get("FIVE")));
        three=(String)ht.get("FIVE");
        System.out.println(ht.get("ONE"));
        System.out.println(Double.parseDouble(one)+"\n"+Double.parseDouble(two)+"\n"+Double.parseDouble(three));
    }
}
}
