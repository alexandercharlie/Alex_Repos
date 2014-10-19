/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manjeet
 */
public class CreateUserName {
   public static void main(String[] args)
   {
       String firstName="Manjeet";
       String lastName="Kumar";
       String loginname=firstName+lastName.substring(0,1);
       loginname=loginname+1;
       System.out.println(loginname);
       System.out.println(firstName.substring(0,3)+""+lastName.substring(0,1));
   }
}
