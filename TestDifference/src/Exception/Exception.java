/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import org.omg.CORBA.BAD_CONTEXT;

/**
 *
 * @author Manjeet Kumar
 */
public class Exception {

    public static void main(String[] args) {
        try {
            int x = 1;
            int res = x / 0;
            System.out.println(res);
        } catch (RuntimeException re) {
            System.out.println("Runtime Exception: " + re);
        }
        /* Since Exception has allready been caught so this declaration can't be made
        catch (ArithmeticException am) {
            am.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException aib) {
            aib.printStackTrace();
        } 

*/
    }
}
