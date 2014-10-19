/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeZone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/**
 *
 * @author Manjeet Kumar
 */
public class TimeZone1 {

    public static void main(String[] args) {

        String timezones = "ACDT,ACST,ACT,ADT,AEDT,AEST,AFT,AKDT,AKST,AMST,AMT,ART,AST,AST,BDT,BIOT,BIT,BOT,BRT,BST,BST,BTT,CAT,CCT,CET,CHADT,CHAST,CIST,CKT,CST,DFT,EAST,EAT,ECT,FET,FKST,"
                + "GMT,GST,GST,GYT,HADT,HAEC,HAST,HMT,HST,ICT,IDT,IRKT,MUT,MYT,NDT,NFT,PST,VET,WEDT,WEST,WET,YAKT,YEKT";
        List<String> items = Arrays.asList(timezones.split("\\s*,\\s*"));
       // System.out.println(items);
        int sizearr = items.size();
        int arrsize[] = new int[sizearr];
        for (int i = 0; i < arrsize.length; i++) {
            //  System.out.println(items.get(i));
            String tz = items.get(i);
            Calendar cal = new GregorianCalendar(TimeZone.getTimeZone(tz));
            int hour12 = cal.get(Calendar.HOUR);         // 0..11
            int minutes = cal.get(Calendar.MINUTE);      // 0..59
            int seconds = cal.get(Calendar.SECOND);      // 0..59
            boolean am = cal.get(Calendar.AM_PM) == Calendar.AM;
            boolean pm = cal.get(Calendar.AM_PM) == Calendar.PM;
            if (am) {
                System.out.println(tz + " Time: " + hour12 + ":" + minutes + ":" + seconds + " AM");
            }
            if (pm) {
                System.out.println(tz + " Time: " + hour12 + ":" + minutes + ":" + seconds + " PM");
            }
        }
    }
}
