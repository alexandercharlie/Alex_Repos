/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SubstringInString;

/**
 *
 * @author Manjeet Kumar
 */
public class SubStringInString {

    public static void main(String[] args) {
        String string = "Madam, I am Adam";

// Starts with
        boolean b = string.startsWith("Mad");  // true
        System.out.println(b);

// Ends with
        b = string.endsWith("dam");             // true
System.out.println(b);
// Anywhere
        b = string.indexOf("I am") > 0;         // true
System.out.println(b);
// To ignore case, regular expressions must be used
System.out.println(b);
// Starts with
        b = string.matches("(?i)mad.*");
        System.out.println(b);
// Ends with
        b = string.matches("(?i).*adam");
System.out.println(b);
// Anywhere
        b = string.matches("(?i).*i am.*");
    System.out.println(b);
 
    System.out.println("--------Another Test-------------");
            String city="Asia/Hong Kong_";
        String city2="Asia/Ashgabat - Turkmenistan Time| Current Time: 3:19:1 PM";
String city3="Asia/Ashkhabad - Turkmenistan Time";
String city4="Asia/Baghdad - Arabia Standard Time";
String city5="Asia/Bahrain";
boolean wf = city.endsWith("Hong Kong");int wf1=city.indexOf("Hong Kong");System.out.println("Yeah it works: "+wf+" Match:"+wf1);

boolean wf2=city.matches("(?i).*ong.*");System.out.println("Found Hong Kong: "+wf2);
boolean wf3=city5.matches("(?i).*bah.*");System.out.println("Found Bahrain: "+wf3);
    }
}
