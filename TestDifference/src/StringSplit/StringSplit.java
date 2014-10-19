/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringSplit;

/**
 *
 * @author Manjeet Kumar
 */
public class StringSplit {
    public static void main(String args[])
    {   String arr[]=null;
    String s1="",s2="";
        String s="99999^0888888";
        if (s.indexOf('^') != -1)
	{
        arr=s.split("\\^");
        s1=arr[0];
        s2=arr[1];
        System.out.println(s1+"\n"+s2);
    }

    }
}
