/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manjeet Kumar
 */
import java.util.*;
public class test {
public static int tryPrimitives(int x, int y) {
       x = x + 10;
       y = y + 90;
       //return x;
       return y;
    }
public static void main(String[] args)
{
int p = 1;
    int q = 2;
    int r = 5;
    r=tryPrimitives(p, q);    
 System.out.println(r);
 System.out.println("p = "+p+"  q = "+q);
 System.out.println(tryPrimitives(p, q));
 
 String email="manjeet@birchstreet.net";
 String email2="manjeet@gdiindia.com";
 String email3="manjeet@birchstreet.net";
 if(!email.equalsIgnoreCase(email3))
 {
     System.out.println("match");
     
 }else System.out.println("not match");
String emailall=emailGet();
 System.out.println(emailall);
}
private static String emailGet()
{
    
    StringBuffer recipients = new StringBuffer(128);
	StringBuffer emailData = new StringBuffer(256);
	String emailAddress ="manjeet@birchstreet.net,manjeet@gdiindia.com,manjeet@birchstreet.net";
        String emailTest="manjeet@birchstreet.net,manjeet@gdiindia.com,manjeet@birchstreet.net";
	StringTokenizer token = null;
	String oneAddress = null;
Vector emailList=new Vector();
emailList.addElement(emailAddress);
for(int i=0; i<emailList.size(); i++)
		{
			emailAddress = (String)emailList.elementAt(i);
			
			if(emailAddress!=null&&emailAddress.length()!=0)
			{
				token = new StringTokenizer(emailAddress, ";");
				while(token.hasMoreTokens())
				{
					oneAddress = (token.nextToken()).trim();
					if(oneAddress.length()!=0)
						recipients.append("<TO_RECIPIENT>" + oneAddress + "</TO_RECIPIENT>");
				}
			}
		}
return recipients.toString();
}
}
