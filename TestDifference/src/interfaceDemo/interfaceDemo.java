/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceDemo;

/**
 *
 * @author Manjeet Kumar
 */
public class interfaceDemo {

    void interfaceTestMethod() {
        if (test.i < 1) {
            System.out.println("Value of I is less than '1'. Since I='" + test.i + "'");
        } else if (test.i >= 1) {
            System.out.println("I is not less than '1'. Since I= '" + test.i + "'");
        }
        if ((test.str.equals(null)) || (test.str.equals(""))) {
            System.out.println("String is empty: " + " String is '" + test.str + "'");
        } else if ((!test.str.equals(null)) || (!test.str.equals(""))) {
            System.out.println("String is not empty, String is '" + test.str + "'");
        }
    }

    public static void main(String[] args) {
        interfaceDemo id = new interfaceDemo();
        id.interfaceTestMethod();
    }
}

interface test {//this is interface

    public String str = "hello test";
    public int i = 10;
    public double d = 0.00;
    public float f = 0.f;
}
