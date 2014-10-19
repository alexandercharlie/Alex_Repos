/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RegExp;

/**
 *
 * @author Manjeet Singh
 */
import java.util.StringTokenizer;
public class StringClear {
    public static void main(String[] args) {
        String s="we are,testing % ^ & * 90yeards of(";
        s = s.replaceAll("\\W", " "); 
        System.out.println(s);
        StringTokenizer st = new StringTokenizer(s);
 
		System.out.println("---- Split by space ------");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
    }
}
