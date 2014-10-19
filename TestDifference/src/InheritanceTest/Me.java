/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceTest;

/**
 *
 * @author Manjeet Kumar
 */
public class Me {
    public static void main(String[] args)
    {
        God g=new God();
        Human h=new Human();
        Man m=new Man();
        Child c=new Child();
        Me me=new Me();
        
        System.out.println(g instanceof God);
        System.out.println(h instanceof Human);
        System.out.println(m instanceof Man);
        System.out.println(c instanceof Child);
        System.out.println(me instanceof Me);
        
        
        
        
        
        
    }
}
