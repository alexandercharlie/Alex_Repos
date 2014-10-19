/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package String_to_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 *
 * @author Manjeet Kumar
 */
public class StrToArrList {

        String sWsItemID = "152|156|157|158|";
    public String[] test() {
        String[] str = null;
        String testStr = "1,2,3,4,5,6";
    

        return str;
    }

    public static void main(String[] args) {
        String str = "1   , 112";
        String compid = "1|1|1|1|";
        String st="1|2|3|4|5|6";
        /* Process
         * To convert Java String to ArrayList, first split the string and then
         * use asList method of Arrays class to convert it to ArrayList.
         */

        //split the string using separator, in this case it is ","
        String[] strValues = str.split(",");
        for(int i=0;i<strValues.length;i++)
        {
            System.out.println("===== "+strValues[i].trim());
        }

        /*
         * Use asList method of Arrays class to convert Java String array to ArrayList
         */
                System.out.println(st.replaceAll("\\s*|\\s*",","));
        System.out.println(compid.replaceAll("|",",").replace("|,","").replaceFirst(",", ""));
        ArrayList<String> aListNumbers = new ArrayList<String>(Arrays.asList(strValues));
        //System.out.println("Java String Converted to Array List=" + aListNumbers);
     System.out.println(deDup(compid));
    }
    
    private static String deDup(String s) {
        //s = s.replaceAll(",", ";");
        return new LinkedHashSet<String>(Arrays.asList(s.split("|"))).toString().replaceAll("(^\\[|\\]$)", "").replace("| ", ",");
    }
}
