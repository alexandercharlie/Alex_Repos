/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

/**
 *
 * @author Manjeet Singh
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
public class HashDemo {

        public static void main(String[] args)
{
    Hashtable h;
    Hashtable h1;
    Hashtable ht=new Hashtable();
    ht.put("NAME","Neha");
    ht.put("AGE","25");
    ht.put("SEX","F");
    ht.put("ADDRESS","Jammu & Kashmir");
    
    Hashtable ht1=new Hashtable();
    ht1.put("NAME","Jasmine");
    ht1.put("AGE","29");
    ht1.put("SEX","F");
    ht1.put("ADDRESS","Sarajevo");
    
    Hashtable ht2=new Hashtable();
    ht2.put("NAME","Veronika");
    ht2.put("AGE","31");
    ht2.put("SEX","F");
    ht2.put("ADDRESS","Sofia");
    
    Hashtable finalHash=new Hashtable();
    finalHash.put("0",ht);
    finalHash.put("1",ht1);
    finalHash.put("2",ht2);
//    
    HashMap map1 = new HashMap();
    map1.put("0",ht);
    map1.put("1",ht1);
    map1.put("2",ht2);
    
     
  for(int y=0;y<finalHash.size();y++){
  Hashtable t1=(Hashtable) finalHash.get(""+y);
      System.out.println(t1.get("NAME"));
  }
//
//    System.out.println(finalHash.get("0"));
//    Hashtable t1=(Hashtable) finalHash.get("0");
//    System.out.println(t1.get("SEX"));
  }
  
    }




