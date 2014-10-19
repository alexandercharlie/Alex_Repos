
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manjeet
 */
public class TestSum {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("yyyy");
        String currYear = simpleDateformat.format(date);
        int year = Integer.parseInt(currYear);
        year=year+1;
        for(int i=0;i<5;i++)
        {
            System.out.println(year++);
        }
    }
   }
