/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithDate;

import java.text.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manjeet Kumar
 */
public class WorkingWithDate {
    
public static void main(String[] args)
{
        try {
            List<Date> dates = new ArrayList<Date>();

        String str_date ="27/08/2010";
        String end_date ="02/09/2010";

        DateFormat formatter ; 
Calendar cal=Calendar.getInstance();
        formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date  startDate = (Date)formatter.parse(str_date); 
        Date  endDate = (Date)formatter.parse(end_date);
        long interval = 24*1000 * 60 * 60; // 1 hour in millis
        long endTime =endDate.getTime() ; // create your endtime here, possibly using Calendar or Date
        long curTime = startDate.getTime();
        while (curTime <= endTime) {
            dates.add(new Date(curTime));
            curTime += interval;
        }
        for(int i=0;i<dates.size();i++){
            Date lDate =(Date)dates.get(i);
            String ds = formatter.format(lDate);
            
            //cal.set(lDate);
     int val = cal.get(Calendar.DAY_OF_WEEK);
     System.out.println(val);
            if(ds.equals("28/08/2010"))
            {
                System.out.println("Date is="+ds+" Today is Holiday");
            }
            else
            System.out.println(" Date is ..." + ds);
        }
        } catch (ParseException ex) {
            Logger.getLogger(WorkingWithDate.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}

