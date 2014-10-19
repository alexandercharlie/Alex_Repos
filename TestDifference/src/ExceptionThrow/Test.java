/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionThrow;

/**
 *
 * @author Manjeet Kumar
 */
class MyException extends Exception {

    public MyException(String msg) {
        super(msg);
    }
}

class AddException extends Exception {

    public AddException(String str) {
        super(str);
    }
}

public class Test {

    static int divide(int a, int b) throws MyException {
        if (b == 0) {
            throw new MyException("Can't Divide by zero");
        }
        return a / b;
    }

    static int add(int a, int b) throws AddException {
        if (b != 2) {
            throw new AddException("Can't Perform Addition");
        }
        return a + b;
    }

    public static void main(String[] args) {

        try {
            System.out.println(divide(4, 0));
        } catch (MyException exc) {
            exc.printStackTrace();
        }

        try {
            System.out.println(add(4, 1));
        } catch (AddException adde) {
            adde.printStackTrace();
        }
    }
}
