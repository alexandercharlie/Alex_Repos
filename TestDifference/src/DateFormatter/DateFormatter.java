/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DateFormatter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manjeet Singh
 */
public class DateFormatter {
    public static void main(String[] args){
        System.out.print("Today's Date: "+new Date()); 
    SimpleDateFormat format = new SimpleDateFormat("d");
    String date = format.format(new Date());


    if(date.endsWith("1") && !date.endsWith("11"))
        format = new SimpleDateFormat("EE MMM d'st', yyyy");
    else if(date.endsWith("2") && !date.endsWith("12"))
        format = new SimpleDateFormat("EE MMM d'nd', yyyy");
    else if(date.endsWith("3") && !date.endsWith("13"))
        format = new SimpleDateFormat("EE MMM d'rd', yyyy");
    else 
        format = new SimpleDateFormat("MMMM, yyyy");

    String yourDate = format.format(new Date());
    
    System.out.println(date+"\n"+yourDate);
    Date date1=new Date();
    String op="";
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        try {
            String tempDate="11/18/2013 12:44:15".substring(0,10);
            date1=sdf.parse(tempDate);
        //    date1=sdf.format(sdf.parse(tempDate));
        } catch (ParseException ex) {
            Logger.getLogger(DateFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Date createDate = new Date();
        String input = "11/18/2013 12:44:15";
        SimpleDateFormat inputFormatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        try {
            createDate = inputFormatter.parse(input);
            System.out.println(createDate+" ==== ");
        } catch (ParseException ex) {
            Logger.getLogger(DateFormatter.class.getName()).log(Level.SEVERE, null, ex);
        }

        SimpleDateFormat outputFormatter = new SimpleDateFormat("MMMM yyyy");//new SimpleDateFormat("MM/dd/yyyy");
        String output = outputFormatter.format(createDate); 
        System.out.println(output);
        
    }
}
