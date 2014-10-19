/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Manjeet Kumar
 */
final class tesT {
    public static void main(String[] args)
    {
//String url="http://qadev/QADEV/CPSupplierRfqResponse.jsp?SubID=1&SupplierID=3&PC=000000000000023&QuoteNum=2013061011146995Admin&dt=20130610111432427";
//String sub="";
//sub=url.substring(url.indexOf("=")+1).trim();
//System.out.println(sub);
//
//String string="X%A1#Z9f400c9bb8f763538d296965a92d65ca";
//if(string.indexOf("X%A1")!=-1)
//    System.out.println(string);
//    
//    
     String ss="152302017818";
     System.out.println(ss.length());
     //System.out.println(ss.substring(ss.length()-4,ss.length())); 
     StringBuffer svf=new StringBuffer();
int len = ss.length()-4;
for(int x=0;x<len;x++)
{
    svf.append("*");
}
    ss=svf.toString()+ss.substring(ss.length()-4,ss.length());
    System.out.println(ss);
    
    }

    
}
