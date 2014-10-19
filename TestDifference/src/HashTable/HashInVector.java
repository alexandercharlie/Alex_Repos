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
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class HashInVector {

    public static void main(String[] args) {
        String record[] = {""};
        String mainRecord[] = new String[record.length];

        Vector<Hashtable> v = new Vector<Hashtable>();

        Vector<String> vec = new Vector<String>();

        Hashtable hash1 = new Hashtable();
        hash1.put("SN", "1");
        hash1.put("NAME", "Neha");
        hash1.put("AGE", "25");
        hash1.put("SEX", "F");
        hash1.put("ADDRESS", "Jammu & Kashmir");

        Hashtable ht1 = new Hashtable();
        ht1.put("SN", "2");
        ht1.put("NAME", "Jasmine");
        ht1.put("AGE", "29");
        ht1.put("SEX", "F");
        ht1.put("ADDRESS", "Sarajevo");

        Hashtable ht2 = new Hashtable();
        ht2.put("SN", "1");
        ht2.put("NAME", "Veronika");
        ht2.put("AGE", "31");
        ht2.put("SEX", "F");
        ht2.put("ADDRESS", "Sofia");

        Hashtable ht3 = new Hashtable();
        ht3.put("SN", "2");
        ht2.put("NAME", "Miskha");
        ht2.put("AGE", "27");
        ht2.put("SEX", "F");
        ht2.put("ADDRESS", "Vladivostok");

        Hashtable ht4 = new Hashtable();
        ht3.put("SN", "2");
        ht2.put("NAME", "Anna");
        ht2.put("AGE", "29");
        ht2.put("SEX", "F");
        ht2.put("ADDRESS", "Tel aviv");



        Hashtable<Integer, String> names = new Hashtable();
        vec.addElement(new String("name1"));
        vec.addElement(new String("name2"));
        vec.addElement(new String("name3"));
        vec.addElement(new String("name4"));
        vec.addElement(new String("name5"));
        
        v.addElement(hash1);
        v.addElement(ht1);
        v.addElement(ht2);
        v.addElement(ht3);
        v.addElement(ht4);

        int VecSize = v.size();

        for (int i = 0; i < VecSize; i++) {

//            names.put(new Integer(i), new String(v.elementAt(i)));
        }

        Set set = names.keySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            Integer temp = (Integer) itr.next();
            System.out.println(temp + ":" + names.get(temp));
        }
        System.out.println();
    }
}