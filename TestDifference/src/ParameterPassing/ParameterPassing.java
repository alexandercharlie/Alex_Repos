/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ParameterPassing;

/**
 *
 * @author Manjeet Kumar
 */
public class ParameterPassing {
    
public int mul(int a,int b)
{
    return a*b;
}
/*
 * We use the term formal parameters to refer to the parameters in the definition of the method.
 * In the example, a and b are the formal parameters. You can remember to call them ``formal'' 
 * because they are part of the method's defintion, and you can think of a definition as being formal
 */
public static void main(String[] args)
{
    ParameterPassing ps=new ParameterPassing();
    
    int a=ps.mul(10,12);System.out.println(a);    
    int length=12;
    int width=23;
    /*
     * We use the term actual parameters to refer to variables in the method call, in this case length and width. 
     * They are called ``actual'' because they determine the actual values that are sent to the method.
     * 
     */
    System.out.println(ps.mul(length, width));
}
}
