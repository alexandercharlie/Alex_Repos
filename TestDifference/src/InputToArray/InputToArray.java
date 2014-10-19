/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InputToArray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Manjeet Kumar
 */
public class InputToArray {

    public static void main(String args[]) {
        /*int a[]={0,0,0,0,0,0} , b[]={0,0,0,0,0,0};
        for ( int number = 5; number <=10; number++)
        {
        a[number-5] = number;
        b[number-5]= (number * number);
        System.out.println(a[number-5]);
        System.out.println(b[number-5]);
        }
    * 
    */
//I dont't think above example is justice to your quest to "Take Input and store in Array". Here is better example

        ArrayList<String> name = new ArrayList<String>();
        ArrayList<Integer> phone = new ArrayList<Integer>();
        ArrayList<String> newName = new ArrayList<String>();
        ArrayList<Integer> newPhone = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        // while (true) {
        //or
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter your name: ");
            name.add(sc.next());
            System.out.println("Please enter your number: ");
            phone.add(sc.nextInt());
        }
        //}
        System.out.println("Total Name=" + name + " Total number=" + phone);

        for (int l = 0; l < name.size(); l++) {
            System.out.println(" Name=" + name.get(l));
            newName.add(name.get(l));
        }
        for (int m = 0; m < phone.size(); m++) {
            System.out.println(" Phone=" + phone.get(m));
            newPhone.add(phone.get(m));
        }
//after copying from one array to new array
        System.out.println("new Name=" + newName + " new phone=" + newPhone);
    }
}
