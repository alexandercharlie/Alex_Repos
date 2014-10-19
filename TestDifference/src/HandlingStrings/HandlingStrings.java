/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HandlingStrings;

/**
 *
 * @author Manjeet Kumar
 */
public class HandlingStrings {
    
public static void main(String[] args)
{
    String details = "Hello \"world\"!";
details = details.replace("\"","\\\"");
System.out.println(details);   
}
}
