/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

/**
 *
 * @author Manjeet Kumar
 */
public class swap {
    
public void swap(int x,int y)
{
    int temp=x;
    x=y;
    y=temp;
    System.out.println(x+"  "+y);
}

public int swap1(int x,int y)
{
    int temp=x;
    x=y;
    y=temp;
    return 0;
}
public static void main(String[] args)
{
    swap s=new swap();
    int p=10;
    int q=15;
    s.swap(p,q);
}
}
