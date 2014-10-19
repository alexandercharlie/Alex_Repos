/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;


/**
 *
 * @author Manjeet Singh
 */

// Create a new thread.
class NewThread implements Runnable {
   Thread t;
   NewThread() {
      // Create a new, second thread
      t = new Thread(this, "Demo Thread");
      System.out.println("Child thread: " + t);
      System.out.println("ID="+t.getId()+""
              + "\nNAME="+t.getName()+""
              + "\nPRIORITY="+t.getPriority()+""
              + "\nSTACK="+t.getStackTrace().length+""
              + "\nTO_STRING="+t.toString()+""
              + "\nCLASS LOADER="+t.getContextClassLoader()+""
              + "\nSTATE="+t.getState()+""
              + "\nTHREAD_GROUP="+t.getThreadGroup()+""
              + "\nIS_ALIVE="+t.isAlive() +""
              + "\nIS_DAEMON="+t.isDaemon()+""
              );
      t.dumpStack();
      System.out.println(t);
     // t.start(); // Start the thread
   }
   
   // This is the entry point for the second thread.
   public void run() {
      try {
         for(int i = 5; i > 0; i--) {
            System.out.println("Child Thread: " + i);
            // Let the thread sleep for a while.
            Thread.sleep(500);
         }
     } catch (InterruptedException e) {
         System.out.println("Child interrupted.");
     }
     System.out.println("Exiting child thread.");
   }
}

public class ThreadDemo {
   public static void main(String args[]) {
      new NewThread(); // create a new thread
      try {
         for(int i = 5; i > 0; i--) {
           System.out.println("Main Thread: " + i);
           Thread.sleep(3000);
         }
      } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }
      System.out.println("Main thread exiting.");
   }
}