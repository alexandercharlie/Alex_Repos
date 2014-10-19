/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Manjeet Kumar
 */
public class HashTableDemo {

    public static void main(String[] args) {
        //exclusive Demo of hashmap
        Map map = new HashMap();
        map.put(1, "Abc");
        map.put(2, "Def");
        map.put(3, "Ijk");
        System.out.println("All of the mappings   " + map);

        //put all mappings of map into map1 
        Map map1 = new HashMap();
        map1.putAll(map);

        System.out.println("All of the mappings   " + map1);

        //Demo of Collections

        Hashtable numbers = new Hashtable();
        numbers.put("one", new Integer(1));
        numbers.put("two", new Integer(2));
        numbers.put("three", new Integer(3));
        numbers.put("four", new Integer(4));
        numbers.put("five", new Integer(5));
        numbers.put("Six", new Integer(6));


        Integer n = (Integer) numbers.get("two");

        if (n != null) {
            System.out.println("Two=" + n);
        }

        HashMap hMap = new HashMap();
        hMap.put("A", "apple");           //Without String construtor invocation|
        hMap.put("B", new String("ball"));//With String constructor invocation  |Both can be used
        hMap.put("C", "cat");
        hMap.put("D", new String("doll"));
        hMap.put("E", "eye");
        hMap.put("F", new String("fruit"));
        hMap.put("G", "go");
        hMap.put("H", new String("Hashmap"));


        String s = (String) hMap.get("A");
        if (!s.equals(null)) {
            System.out.println("A for " + s);
            System.out.println("B for " + hMap.get("B"));
        }

        HashSet hs = new HashSet();
        hs.add("Megan");
        hs.add("Regan");
        hs.add("Donald");
        hs.add("Eleen");
        hs.add("Cathy");
        hs.add("Fiennes");
        System.out.println(hs);

//Example using Set
        // Create the set
        Set set = new HashSet();

// Add elements to the set
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println("SET has following elements(after addition): " + set);
// Remove elements from the set
        set.remove("c");
        System.out.println("SET has following elements(after Removing C): " + set);


// Get number of elements in set
        int size = set.size();          // 2
        System.out.println("Number of elements in SET: " + size);


// Adding an element that already exists in the set has no effect
        set.add("a");
        size = set.size();              // 2
        System.out.println("Adding and Element(observe the difference): " + size + "  Now SET is " + set + "  Because 'a' allready exist in SET");

        set.add("m");
        size = set.size();
        System.out.println("Adding Element other than existing increases size to" + size + "Now SET is: " + set);
// Determining if an element is in the set
        boolean a = set.contains("a");
        boolean b = set.contains("b");  // true
//b = set.contains("c");          // false
        boolean c = set.contains("c");
        boolean m = set.contains("m");

        System.out.println("Checking if it contains A:" + a);
        System.out.println("Checking if it contains B:" + b);
        System.out.println("Checking if it contains C:" + c);
        System.out.println("Checking if it contains M:" + m);

// Iterating over the elements in the set
        Iterator it = set.iterator();
        while (it.hasNext()) {
            // Get element
            Object element = it.next();

            System.out.println("Check the Object :" + element);
        }

// Create an array containing the elements in the set (in this case a String array)
        String[] array = (String[]) set.toArray(new String[set.size()]);
        System.out.println("See array: " + array);

    }
}
