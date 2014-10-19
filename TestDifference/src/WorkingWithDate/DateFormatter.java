/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithDate;

/**
 *
 * @author Manjeet Singh
 */
public class DateFormatter {
        public static void main(String[] args) {
            String date="3/15/2014";
            String arrayLine[]=null;
            if(date.indexOf("-")!=-1)
         arrayLine=date.split("-");
            if(date.indexOf("/")!=-1)
                arrayLine=date.split("/");
         for(int i=0;i<arrayLine.length;i++)
             System.out.println(arrayLine[i]);
         
         int i=2;
         if(i<10)
             System.out.println("0"+i);
        }
}
