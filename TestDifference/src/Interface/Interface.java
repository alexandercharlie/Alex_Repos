/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author Manjeet Kumar
 */
interface check {

    public void message();
}

public class Interface {

    public static void main(String[] args) {
        try {
            check t = new check() {

                
                
                @Override
                public void message() {
                    System.out.println("Method defined in the interface");
                }
            };
            t.message();
        } catch (Exception ex) {
            System.out.println("" + ex.getMessage());
        }
    
    }
    public void verify()
    {
        String authorizedName[]={"manjeet","aishwarya","pooja","vijay"};
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter Your Name Please: ");
        String name=sc.next();
        if(name.equals(authorizedName.length))
        {
            System.out.println("You are welcome");
        }
   
    }
}

interface verify
{
    public void verify();
}