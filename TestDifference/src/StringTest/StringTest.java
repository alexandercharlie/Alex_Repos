/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringTest;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Manjeet Kumar
 */
public class StringTest{
public static void main(String[] args) {
    System.out.println("Compile test of netbeans");
String s = "a\n\"a\"\ta\n [q]\\q$\tq";
String b="{14}{15}{16}{17}{18}{19}";
String a1;String a2;
b.replaceFirst("\\{.*?\\{}.*?", "");
b.replaceAll("\\}.*?\\{", ",");
a1=b.replaceFirst("\\{.*?", "").replace("}{", ",").replace("}", "");//.replaceAll("\\}.*?\\{", ",");

System.out.println(s);
s = s.replaceAll("[\\n\\t\\\\\"$/]*"," ");
System.out.println(s);
System.out.println("Testing B "+a1);

String s2 = "a\n\"a\"\ta\n [q]\\q$\tq";
System.out.println("S2 first="+s2);
s2 = s2.replaceAll("[\\n\\t\\\\\"$/]*"," ").replace('[',' ').replace(']',' ');
System.out.println("S2 Now="+s2);


String input = "xyaahhfhajfahj{adhadh}fsfhgs{sfsf}"; 
String output = input.replaceAll("\\{.*?\\}", ","); 
System.out.println(output );



//display number with commas
double d = 123456.78;
    DecimalFormat df = new DecimalFormat("#####0.00");
    System.out.println(df.format(d));
    
    
    //another demo
      double l = 123456.78;

    DecimalFormatSymbols dfs = df.getDecimalFormatSymbols();
    // make sure it's a '.'
    dfs.setDecimalSeparator(',');
    df.setDecimalFormatSymbols(dfs);
    System.out.println(df.format(d));
}
}

