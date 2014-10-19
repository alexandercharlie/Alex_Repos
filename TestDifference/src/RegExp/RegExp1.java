/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExp;

/**
 *
 * @author Manjeet Singh
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 { 
  public static void main(String[] args) {
    String s = ".JPG";
    Pattern p = Pattern.compile("\\b(?!(?:ANI|BMP|CAL|FAX|GIF|IMG|JBG|JPE|JPEG|JPG|MAC|PBM|PCD|PCX|PCT|PGM|PNG|PPM|PSD|RAS|TGA|TIFF|WMF)\\b)\\w+",Pattern.CASE_INSENSITIVE);//("(.*?)\\((.*)\\)");
    Matcher m1 = p.matcher(s);
    if (m1.matches()) {
      System.out.println(s);
//      System.out.println(m1.group(2));
    }
//    System.out.println();
//    Matcher m2 = p.matcher(m1.group(2));
//    if (m2.matches()) {
//      System.out.println(m2.group(1));
//      System.out.println(m2.group(2));
//    }
    String str="Regex to find a specific word in a string";
   System.out.println(str.matches(".*\\bif\\b.*"));   //false 
   System.out.println(str.matches(".*\\bto\\b.*"));   //true
   System.out.println(s.matches("(?i)(^|\\s+)(ANI|BMP|CAL|FAX|GIF|IMG|JBG|JPE|JPEG|JPG|MAC|PBM|PCD|PCX|PCT|PGM|PNG|PPM|PSD|RAS|TGA|TIFF|WMF|)(\\s+|[.?!]$)"));
  
  //==================================ANOTHER TEST
   str = "Hello. It's a leopard I think. How are you? It's just a dog or a cat. Are you sure?";
//Pattern pat = Pattern.compile("[A-Z](?i)[^.?!]*?\\b(dog|cat|leopard)\\b[^.?!]*[.?!]");
Pattern pat = Pattern.compile("[A-Z](?i)[^.?!]*?\\b(.ANI|.BMP|.CAL|.FAX|.GIF|.IMG|.JBG|.JPE|.JPEG|.JPG|.MAC|.PBM|.PCD|.PCX|.PCT|.PGM|.PNG|.PPM|.PSD|.RAS|.TGA|.TIFF|.WMF)\\b[^.?!]*[.?!]");
Matcher m = pat.matcher(s);

while (m.matches()) {
    System.out.println(s);
}
  }
}
