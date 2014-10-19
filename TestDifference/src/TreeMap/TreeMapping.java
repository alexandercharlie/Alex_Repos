/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeMap;

/**
 *
 * @author Manjeet Kumar
 */
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.TreeMap;
 
public class TreeMapping {
 
  public static void main(String[] args) {
   
    //create TreeMap object
    TreeMap treeMap = new TreeMap();
   
    //add key value pairs to TreeMap
    treeMap.put("1","One");
    treeMap.put("2","Two");
    treeMap.put("3","Three");
   
    /*
      To check whether a particular key exists in TreeMap use
      boolean containsKey(Object key) method of TreeMap class.
      It returns true if the TreeMap contains mapping for specified key
      otherwise false.
    */
   System.out.println("Contains Key="+treeMap.containsKey("2")+" Contains Value="+treeMap.containsValue("One"));//for checking particular key(1) or value(One)
    boolean blnExists = treeMap.containsKey("1");
    System.out.println("1 exists in TreeMap ? : " + blnExists);
  
  //2. Head Map Example
    
        TreeMap HeadMap = new TreeMap();
   
    //add key value pairs to TreeMap
    HeadMap.put("1","One");
    HeadMap.put("3","Three");
    HeadMap.put("2","Two");
    HeadMap.put("5","Five");
    HeadMap.put("4","Four");
 
    /*
      To get a Head Map from Java TreeMap use,
      SortedMap headMap(Object toKey) method of Java TreeMap class.
     
      This method returns the portion of TreeMap whose keys are less than
      toKey.
 
      Please note that, the SortedMap returned by this method is backed by
      the original TreeMap. So any changes made to SortedMap will be
      reflected back to original TreeMap.
    */
   
    SortedMap sortedMap = HeadMap.headMap("3");
   
    System.out.println("Head Map Contains : " + sortedMap);
   
    /*
      Please also note that,
      - SortedMap throws IllegalArgumentException for any attempts to insert the
      key grater than or equal to toKey.
     
      - subMap throws ClassCastException, if toKey can not be compared using
      Map's Comparators
    */
  
    
    //3. Get Set View From Keys From TreeMap Example
    
   TreeMap treeKey = new TreeMap();

   //add key value pairs to TreeMap
    treeKey.put("1","One");
    treeKey.put("3","Three");
    treeKey.put("2","Two");
   
    /*
      get Set of keys contained in TreeMap using
      Set keySet() method of TreeMap class
    */
   
    Set st = treeMap.keySet();
   
    System.out.println("Set created from TreeMap Keys contains :");
   
    /*
      Iterate through the Set of keys.
      Please note that Set's iterator will return the keys in ascending order.
    */
    Iterator itr = st.iterator();
    while(itr.hasNext())
      System.out.println(itr.next());
     
    /*
       Please note that resultant Set object is backed by the TreeMap.
       Any key that is removed from Set will also be removed from
       original TreeMap object. The same is not the case with the element
       addition.
    */
   
    //remove 1 from Set
    st.remove("1");
   
    //check if original TreeMap still contains 2
    boolean bln1 = treeMap.containsKey("1");
    boolean bln2=treeMap.containsKey("2");
    boolean bln3=treeMap.containsKey("3");
    
    System.out.println("Does TreeMap contain 1? " + bln1);//false because it has been removed before
    System.out.println("Does TreeMap contain 2? " + bln2);//true because it hasn't been removed before
    System.out.println("Does TreeMap contain 3? " + bln3);//true because it hasn't been removed before
  }
}