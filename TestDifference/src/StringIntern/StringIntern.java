/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringIntern;

/**
 *
 * @author Manjeet Singh
 */
public class StringIntern {

    public static void main(String[] args) {
        
        //Ex.1
        String a = new String("Test");
        String b = new String("Test");
        // comparing the Strings as objects & not the value
        System.out.println(a == b);
        /*
         * The result is : false.
         * It is obvious. Because we are creating 
         * two different objects of String class & comparing them. 
         * And their addresses are different.
         */
        
        //Ex.2
        String a1 = "Test";
        String b1 = new String("Test");
        // comparing the Strings as objects & not the value
        System.out.println(a1 == b1);
        /*
         * Result and explanation is same.
         */
        
        //Ex.3
        String a2 = "Test";
        String b2 = "Test";
        // comparing the Strings as objects & not the value
        System.out.println(a2 == b2);

        /*
         * The Result is true
         * The answer is : there is a concept called "String Constant Pool". 
         * Whenever we create a String object using String literals (String a2 = "Test") 
         * Java records an entry in String Constant Pool. 
         * And, at the same time, when we create an object of String using literals, 
         * first it searches in the String Constant pool if the String already exists there. 
         * If it is not there, it creates a new object & record it in the String Constant Pool.
         * But when we create String object using "new String()", it doesn't do any kind of checking 
         * & create an object of String instantly. That's why in example 2, the result is 
         * false though the String was already available in the String constant pool.
         * So, as we know that Strings are immutable.
         * It's a good practice to create String objects using literals to optimize the memory usage of JVM.
         */
        
        //Ex.4
        // String f checks the String constant pool before creating a new instance.
        // it finds the existing String e.
        String e = "Test";
        String f = new String("Test").intern();
        // comparing the Strings as objects & not the value
        System.out.println(e == f);


        //String h checks the String Constant pool before creating instance
        // no such String found in the pool
        // creates a new Object & records it in String Constant Pool
        String g = new String("Test1").intern();
        String h = "Test1";
        // comparing the Strings as objects & not the value
        System.out.println(g == h);
    }
}
