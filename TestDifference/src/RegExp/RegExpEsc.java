/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExp;

/**
 *
 * @author manjeet
 */
public class RegExpEsc {
public static void main(String[] args)
{
    String details = "Hello \"world\" !~!@#$%^&*(){}[]`=?+|";

details = java.util.regex.Pattern.quote(details).replaceFirst("\\\\Q","").replace("\\E","");
System.out.println(details); 
}
}
