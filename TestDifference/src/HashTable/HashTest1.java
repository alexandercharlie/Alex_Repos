/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author Manjeet Singh
 */
public class HashTest1 {
    public static void main(String[] alex)
    {
        int m=1;
        Integer x=10;Integer y=12;
        if(x.equals(y))
        {
            System.out.println("equals"+x+y);
        }
        else
            System.out.println("not equals"+x+y);
        Hashtable<Integer,Boolean> hs=new Hashtable<Integer,Boolean>(); 
        hs.put(1,true);
        hs.put(2,false);
        hs.put(3,true);
        hs.put(4,false);
        System.out.println(hs.hashCode());
        for(int i=0;i<hs.size();i++)
        {
            System.out.println(hs.get(i));
        }
        
        Hashtable<String,Integer> ht=new Hashtable<String, Integer>();
       ht.put("ONE", 1);
        ht.put("TWO", 2);
        ht.put("THREE", 3);
        ht.put("FOUR", 4);
        int d=ht.get("ONE");
        boolean flag1=ht.get("ONE").equals(2)?true:false;
        boolean flag2=ht.get("TWO").equals(1)?true:false;
        System.out.println(d+ "= "+flag1+"   ==   "+flag2);
    }


}
