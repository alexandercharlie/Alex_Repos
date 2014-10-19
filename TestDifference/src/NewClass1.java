
import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manjeet Singh
 */
public class NewClass1 {
    public static void main(String[] args)
    {
        double x=1987;
        BigDecimal bb=new BigDecimal("23.3").setScale(10,1);
      
        System.out.println((double)Math.round(x * 100000000) / 100000000);
        System.out.println(String.format("%.5g%n","12"));
    }
}
