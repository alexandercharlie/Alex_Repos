/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestInput_N;

/**
 *
 * @author Manjeet Kumar
 */
import java.util.*;

public class TestInput_n {

    private String message_valid = "Welcome,You are Authorized";
    private String invalid = "Sorry,You are not Authorized";

    public String getInvalid() {
        return invalid;
    }

    public void setInvalid(String invalid) {
        this.invalid = invalid;
    }

    public String getMessage_valid() {
        return message_valid;
    }

    public void setMessage_valid(String message_valid) {
        this.message_valid = message_valid;
    }

    public void login() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name Please");
        String name=in.next();
        if(name.equals("") || name==null)
        {
            System.out.println("Please Enter Value in the Field");
        }
        else if(name.equals("manjeet"))
        {
            System.out.println("You are welcome "+name+"");
        }
        else if(!name.equals("manjeet"))
        {
            System.out.println("You are not valid user") ;
        System.exit(0);
        }
            
   System.out.println("Enter Your password Please");
   String pass=in.next();
   if(pass.equals("")||pass==null)
   {
       System.out.println("Password can't be left empty");
   }
   else if(pass.equals("1234"))
   {
       System.out.println("Welcome to Alexander & Bros. Corp");
   }
        else if(!pass.equals("1234"))
        {
            System.out.println("You are not valid user") ;
        System.exit(0);
        }
    }
    

    public static void main(String[] args) {
TestInput_n tn=new TestInput_n();
tn.login();
    }

}
