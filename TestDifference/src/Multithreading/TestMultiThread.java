/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Multithreading;

/**
 *
 * @author Manjeet Singh
 */
public class TestMultiThread implements Runnable {
public void run() {
System.out.println("run.");
throw new RuntimeException("Problem");
}
public static void main(String[] args) {
Thread t = new Thread(new TestMultiThread());
t.start();
System.out.println("End of method.");
}
}
