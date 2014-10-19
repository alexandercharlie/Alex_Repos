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
public class UltimateWorldClock {
    private static final String TAG="ULTIMATE WORLD CLOCK is Product of Alexander & BROS. CORP";
  private static final String GLOBAL_LIST =
      "^(Africa|America|Asia|Atlantic|Australia|Europe|Indian|Pacific)/.*";
  private static List<TimeZone> TimeZoneS;
  public static List<TimeZone> getTimeZones() {
    if (TimeZoneS == null) {
      TimeZoneS = new ArrayList<TimeZone>();
      final String[] tZoneID = TimeZone.getAvailableIDs();
      for (final String id : tZoneID) {
        if (id.matches(GLOBAL_LIST)) {
          TimeZoneS.add(TimeZone.getTimeZone(id));
        }
      }
      Collections.sort(TimeZoneS, new Comparator<TimeZone>() {
        public int compare(final TimeZone t1, final TimeZone t2) {
          return t1.getID().compareTo(t2.getID());
        }
      });
    }
    return TimeZoneS;
  }
  public static String getName(TimeZone timeZone)//This is for Displaying Timezone ID and TimeZone Name
  { 
    return timeZone.getID().replaceAll("_", " ");
  }
  public static void main(String[] args) {
    TimeZoneS = getTimeZones();
    Scanner in=new Scanner(System.in);
    System.out.println(TAG+"\nEnter the Name of City You wish to Know Time of:");
    String city=in.next();
   for (TimeZone timeZone : TimeZoneS) {
 //System.out.println(getName(timeZone));
 if(getName(timeZone).matches("(?i).*"+city+".*"))
 {
     Calendar cal = new GregorianCalendar(TimeZone.getTimeZone(getName(timeZone)));
            int hour12 = cal.get(Calendar.HOUR);         
            int minutes = cal.get(Calendar.MINUTE);      
            int seconds = cal.get(Calendar.SECOND);      
            boolean am = cal.get(Calendar.AM_PM) == Calendar.AM;
            boolean pm = cal.get(Calendar.AM_PM) == Calendar.PM;
            if (am) {
                System.out.println(getName(timeZone) + " | Current Time: " + hour12 + ":" + minutes + ":" + seconds + " AM");
            }
            if (pm) {
                System.out.println(getName(timeZone) + " | Current Time: " + hour12 + ":" + minutes + ":" + seconds + " PM");
    }
 }
   }
  }
  }
