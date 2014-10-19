/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginNameGenerator;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Manjeet Singh
 */
public class LoginNameGenerator {
public static void main(String[] args)
{
    
    String fullName="Man";
//    StringTokenizer st = new StringTokenizer(fullName);
//    while(st.hasMoreElements())
//    {
//        System.out.println(st.nextElement());
//    }

 String firstName="",lastName="";
    String[] splitStr = fullName.split("\\s+");
    if(splitStr.length>0)
        firstName=splitStr[0].toString().trim();
    if(splitStr.length>1)
        lastName=splitStr[1].toString().trim();
//    if(firstName.length()>8)
//        firstName=firstName.substring(0,8);
        if (lastName.length() > 0) {
            if (firstName.length() > 8) {
                System.out.println(firstName.substring(0, 8) + lastName.substring(0, 1));
            } else if (firstName.length() < 8) {
                System.out.println(firstName + lastName.substring(0, 1));
            }
        } else {
             if (firstName.length() > 8)
            System.out.println(firstName.substring(0, 8));
             else
                 System.out.println(firstName);
        }
    }
}
