/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeZone;

/**
 *
 * @author Manjeet Kumar
 */
import java.util.*;

public class TimeZones {

    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("INDIA"));

        int hour12 = cal.get(Calendar.HOUR);         // 0..11
        int minutes = cal.get(Calendar.MINUTE);      // 0..59
        int seconds = cal.get(Calendar.SECOND);      // 0..59
        boolean am = cal.get(Calendar.AM_PM) == Calendar.AM;
        boolean pm = cal.get(Calendar.AM_PM) == Calendar.PM;
        if (am) {
            System.out.println("HongKong Current Time: " + hour12 + ":" + minutes + ":" + seconds + " AM");
        }
        if (pm) {
            System.out.println("HongKong Current Time: " + hour12 + ":" + minutes + ":" + seconds + " PM");
        }

        // Get the current hour-of-day at GMT
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        int hourLondon = cal.get(Calendar.HOUR_OF_DAY);  // 0..23
        int minutesLondon = cal.get(Calendar.MINUTE);
        int secondLondon = cal.get(Calendar.SECOND);
        boolean amLondon = cal.get(Calendar.AM_PM) == Calendar.AM;
        boolean pmLondon = cal.get(Calendar.AM_PM) == Calendar.PM;
        if (amLondon) {
            System.out.println("London Current Time: " + hourLondon + ":" + minutesLondon + ":" + secondLondon + " AM");
        }
        if (pmLondon) {
            System.out.println("London Current Time: " + hourLondon + ":" + minutesLondon + ":" + secondLondon + " PM");
        }

        // Get the current local hour-of-day
        cal.setTimeZone(TimeZone.getDefault());
        int hourLocal = cal.get(Calendar.HOUR_OF_DAY);
        boolean AM = cal.get(Calendar.AM_PM) == Calendar.AM;
        if (AM) {
            System.out.println("India Current Time: " + hourLocal + " AM");
        } else {
            System.out.println("India Current Time: " + hourLocal + " PM");
        }


    }
}
