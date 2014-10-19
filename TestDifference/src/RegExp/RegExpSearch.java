/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Manjeet Singh
 */
public class RegExpSearch {
  public static final String EXAMPLE_TEST = "This is my small example "
      + "string which I'm going to " + "use for pattern matching.";

  public static void main(String[] args) {
    System.out.println(EXAMPLE_TEST.matches("\\w.*"));
    String[] splitString = (EXAMPLE_TEST.split("\\s+"));
    System.out.println(splitString.length);// should be 14
    for (String string : splitString) {
      System.out.println(string);
    }
    // replace all whitespace with tabs
    System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
    String foot="/UserFile/ProgPortalSpecImage/1/testFoot.JPG";//"C:\Users\Public\Pictures/UserFile/ProgPortalSpecImage/1/testFoot.jpg";
    String head="Pictures/UserFile/PPSpecHeaders/1/";//"C:\Users\Public\Pictures/UserFile/PPSpecHeaders/1/";
    String test =  "This is a sentence";
String lastWord = foot.substring(foot.lastIndexOf("/")+1);
System.out.println("Before match: "+lastWord);
if(lastWord.matches("\\b(?!(?:ANI|BMP|CAL|FAX|GIF|IMG|JBG|JPE|JPEG|JPG|MAC|PBM|PCD|PCX|PCT|PGM|PNG|PPM|PSD|RAS|TGA|TIFF|WMF)\\b)\\w+")) 
System.out.println("After match: "+lastWord);
  }
}
