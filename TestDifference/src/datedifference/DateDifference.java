/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datedifference;

/**
 *
 * @author Manjeet Kumar
 */
import java.sql.*;
import java.util.*;
public class DateDifference{
       public int daysBetween(java.util.Date d1, java.util.Date d2){
       return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
       }
     public DateDifference(){
    try{
     Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.24.95.152:1521:USAQA8","pbeach","sagence");
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select leave_startdate,leave_enddate from hrm_leave_detail where employee_id=13");
    java.util.Date date=null;
    if(rs.next()){
    java.sql.Date d = rs.getDate("leave_startdate");
    date = new java.util.Date(d.getTime());
    }
    java.util.Date currentDate=new java.util.Date();
     System.out.println("Days= "+daysBetween(date,currentDate));
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
    public static void main(String[] args){
      DateDifference inner = new DateDifference();
      }
}