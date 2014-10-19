/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PassByVal;

/**
 *
 * @author Manjeet Kumar
 */
public class PassByVal {

    public static void tryPrimitives(int i, double f, char c, boolean test) {
        i += 10;    //These are formal Parameters
        c = 'z';    //won't be seen outside tryPrimitives.
        if (test) {
            test = false;
        } else {
            test = true;
        }
        f = 1.5;
    }

    public static void main(String[] args) {
        int ii = 1;
        double ff = 1.0;
        char cc = 'a';             //These are actual Prameters
        boolean bb = false;
        // Try to change the values of these primitives:
        tryPrimitives(ii, ff, cc, bb);
        System.out.println("ii = " + ii + ", ff = " + ff
        + ", cc = " + cc + ", bb = " + bb);
    }
}
/*When Java calls a method, it makes a copy of its actual parameters' values and 
 * sends the copies to the method where they become the values of the formal parameters.
 * Then when the method returns, those copies are discarded and the actual parameters have remained unchanged.
 * 
 */
