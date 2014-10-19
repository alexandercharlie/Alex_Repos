/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoveDuplicatesFromString;
import java.util.*;
/**
 *
 * @author Manjeet
 */
public class RemoveDuplicated {
        public static void main(String[] args) {
        String s = "{000000000000865}";
        String arr[] = s.split("}");
        Set set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i] + "}");
        }
        StringBuffer sbf = new StringBuffer();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sbf.append(it.next());
        }
        System.out.println("" + sbf.toString());
    }
}
