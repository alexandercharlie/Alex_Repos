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
public class WorldTimeZonesInJava {
  private static final String GLOBAL_LIST =
      "^(Africa|America|Asia|Atlantic|Australia|Europe|Indian|Pacific)/.*";
  private static List<TimeZone> timeZones;
  public static List<TimeZone> getTimeZones() {
    if (timeZones == null) {
      timeZones = new ArrayList<TimeZone>();
      final String[] tZoneID = TimeZone.getAvailableIDs();
      for (final String id : tZoneID) {
        if (id.matches(GLOBAL_LIST)) {
          timeZones.add(TimeZone.getTimeZone(id));
        }
      }
      Collections.sort(timeZones, new Comparator<TimeZone>() {
        public int compare(final TimeZone t1, final TimeZone t2) {
          return t1.getID().compareTo(t2.getID());
        }
      });
    }
    return timeZones;
  }
  public static String getName(TimeZone timeZone)//This is for Displaying Timezone ID and TimeZone Name
  { 
    return timeZone.getID().replaceAll("_", " ") + " - " + timeZone.getDisplayName();
  }
  public static String getTzone(TimeZone tz)//This is to pass in calendar
  {
      return tz.getID().replaceAll("_", " ");
  }
  public static void main(String[] args) {
    timeZones = getTimeZones();
   for (TimeZone timeZone : timeZones) {
//      System.out.print(getName(timeZone));
  //    System.out.println(getTzone(timeZone));
      
    
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone(getTzone(timeZone)));
            int hour12 = cal.get(Calendar.HOUR);         // 0..11
            int minutes = cal.get(Calendar.MINUTE);      // 0..59
            int seconds = cal.get(Calendar.SECOND);      // 0..59
            boolean am = cal.get(Calendar.AM_PM) == Calendar.AM;
            boolean pm = cal.get(Calendar.AM_PM) == Calendar.PM;
            if (am) {
                System.out.println(getName(timeZone) + "  | Current Time: " + hour12 + ":" + minutes + ":" + seconds + " AM");
            }
            if (pm) {
                System.out.println(getName(timeZone) + "| Current Time: " + hour12 + ":" + minutes + ":" + seconds + " PM");
    }
  }
  }
}