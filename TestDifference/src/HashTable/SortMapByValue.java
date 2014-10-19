/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTable;

/**
 *
 * @author Manjeet Singh
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValue
{
    public static boolean ASC = true;
    public static boolean DESC = false;

    public static void main(String[] args)
    {

        // Creating dummy unsorted map
        Map<String,String> unsortMap = new HashMap<String,String>();
        
//        unsortMap.put("5","RFQ00000594-1-10");
//        unsortMap.put("6","RFQ00000594-1-10");
//        unsortMap.put("7","RFQ00000594-1-10");
//        unsortMap.put("4","RFQ00000594-1-5");
//        unsortMap.put("0","RFQ00000594-1-1");
//        unsortMap.put("1","RFQ00000594-1-2");
//        unsortMap.put("2","RFQ00000594-1-1");
//        unsortMap.put("3","RFQ00000594-1-1");
        unsortMap.put("RFQ00000594-1-10","1");
        unsortMap.put("RFQ00000594-1-10","2");
        unsortMap.put("RFQ00000594-1-10","3");
        unsortMap.put("RFQ00000594-1-5","4");
        unsortMap.put("RFQ00000594-1-1","5");
        unsortMap.put("RFQ00000594-1-2","6");
        unsortMap.put("RFQ00000594-1-1","7");
        unsortMap.put("RFQ00000594-1-1","8");
        Object[] keys = unsortMap.keySet().toArray();
        Arrays.sort(keys);
        for(Object key : keys) {
  System.out.println(unsortMap.get(key));
}

        System.out.println("Before sorting......");
        printMap(unsortMap);

        System.out.println("After sorting ascending order......");
        Map<String, String> sortedMapAsc = sortByComparator(unsortMap, ASC);
        printMap(sortedMapAsc);


        System.out.println("After sorting descindeng order......");
        Map<String,String> sortedMapDesc = sortByComparator(unsortMap, DESC);
        printMap(sortedMapDesc);

    }

    private static Map<String,String> sortByComparator(Map<String,String> unsortMap, final boolean order)
    {

        List<Entry<String,String>> list = new LinkedList<Entry<String,String>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Entry<String, String>>()
        {
            public int compare(Entry<String, String> o1,
                    Entry<String,String> o2)
            {
                if (order)
                {
                    return o1.getValue().compareTo(o2.getValue());
                }
                else
                {
                    return o2.getValue().compareTo(o1.getValue());

                }
            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<String,String> sortedMap = new LinkedHashMap<String, String>();
        for (Entry<String,String> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static void printMap(Map<String,String> map)
    {
        for (Entry<String,String> entry : map.entrySet())
        {
            System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
        }
    }
}