/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swapTest;

import java.util.Scanner;

/**
 *
 * @author Manjeet Kumar
 */
public class swap {
    
public static void swap(int x,int y)
{
    int temp=x;
    x=y;
    y=temp;
    System.out.println("After swapping X="+x+" and Y="+y);
}
public static void main(String[] args)
{
    //Take Input and swap those numbers
Scanner in=new Scanner(System.in);
System.out.println("Enter X");
int num1=in.nextInt();
System.out.println("Enter Y");
int num2=in.nextInt();
System.out.println("Before swapping X="+num1+" and Y="+num2);
swap(num1,num2);//since it's static method. we don't need to have object of it

}
}
