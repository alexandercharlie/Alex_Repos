/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PassingStrings;

/**
 *
 * @author Manjeet Kumar
 */
public class PassingStrings {

    public static void tryString(String s) {
        s = "a different string";
    }

    public static void tryInt(int i) {
        i = 10;
    }

    public static void main(String[] args) {
        //testing String
        String str = "This is a string literal.";
        tryString(str);
        System.out.println("str = " + str);
        //testing number
        int i1 = 12;
        tryInt(i1);
        System.out.println("int= " + i1);
    }
}

/*
 * It is important to remember what Java does when it assigns a string literal to an object. 
 * A different String object is created and the reference variable is set to point to the newly created object.
 * In other words the value of the formal parameter, s, has changed, but this does not affect the actual parameter str.
 * In this example, s pointed to the string object that contains "This is a string literal". 
 * After the first statement of the method executes, s points to the new string, but str has not changed.
 * Like other objects, when we pass a string to a method, we can in principle,
 * change things inside the object (although we can't change which string is referenced, as we just saw).
 * However, this capability is not useful with string because strings are "immutable". They cannot be changed because 
 * the String class does not provide any methods for modification.
 */