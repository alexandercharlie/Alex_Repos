/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manjeet Singh
 */

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
 
public class Timestamp 
{
    private static final String[] VALUES = new String[] {"AB","BC","CD","AE"};
    public static void main( String[] args )
    {
	Date date = new Date();
//SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
//String formattedDate = sdf.format(date);
//System.out.println(formattedDate);
 String timestap=String.valueOf(date.getTime());
 String user="mkumar";
       timestap=timestap.substring(timestap.length()-4);
System.out.println(timestap);
        
//boolean x=Arrays.asList(VALUES).contains("BB");
//System.out.println(x);

//String s="This Payment can not be Processed.Total Amount Should be Greater then Zero.";
//String supplier="ABC SUPPLIER";
//System.out.println(s.substring(0, 34)+"For Supplier "+supplier+".\n"+s.substring(34,s.length()));
//StringBuffer buff=new StringBuffer();
//buff.insert(s.length()-12, supplier).toString();
//System.out.println(buff);
    }
}