/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Manjeet Singh
 */
public class ArrayListRemoveDuplicate {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        List<String> b = new ArrayList<String>();
        for (int i = 0; i < 30; i++) {
            if (i <= 10) {
                a.add("1");
            }
            if (i > 10 && i < 20) {
                a.add("2");
            }
            if (i > 20) {
                a.add("3");
            }
            b.add("" + i + "");
        }
        Set<String> set = new HashSet<String>(a);//use this OR
        List<String> dedupped = new ArrayList<String>(new LinkedHashSet<String>(a));
//        System.out.println("with Duplicates=" + a);
//        System.out.println("B=" + b);
//        System.out.println("Without Duplicates=" + set);
        for(int y=0;y<dedupped.size();y++)
        {
            if(dedupped.get(y).equals("1"))//
                System.out.println("yes"); 
        }
        Iterator firstIt = dedupped.iterator();
        while (firstIt.hasNext()) {
            String str1 = (String) firstIt.next();
            // recreate iterator for second list
            Iterator secondIt = b.iterator();
            while (secondIt.hasNext()) {
                String str2 = (String) secondIt.next();
                if (str1.equals(str2)) {
                    System.out.println(str1 + " === " + str2);
                }
            }
        }

        System.out.println(dedupped);

    }
}
