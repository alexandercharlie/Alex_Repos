/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading.newpackage1;

/**
 *
 * @author Manjeet Singh
 */
// File Name : DisplayMessage.java
// Create a thread to implement Runnable
public class DisplayMessage implements Runnable
{
   private String message;
   public DisplayMessage(String message)
   {
      this.message = message;
   }
   public void run()
   {
      while(true)
      {
         System.out.println(message);
      }
   }
}