/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MathJava;

/**
 *
 * @author Manjeet Singh
 */
public class CalculateOrder {

    public static void main(String[] args) {
        double qtyList[] = {4, 4.5};
        double qty = 0.0;
        double qtyTotal = 0.0;
// //       orderQty = 10 + Math.ceil((17-10)/5)*5;
       double d=2.0+Math.ceil(((8.5-2.0)/3.0))*3.0;
       System.out.println(d);
        //Math.ceil(orderQty / minInc) * minInc
//        System.out.println(10.0 + Math.ceil((17.0-10.0)/5.0)*5.0);
        double minQty = 2;
        double minInc = 3;
        for (int i = 0; i < qtyList.length; i++) {
            qty = qtyList[i];
            if (qty > 0) {
                if (minQty > 0) {
                    if (qty < minQty) {
                        qty = minQty;
                    }
                }
            }
            qtyTotal += qty;

        }
        if (minInc > 0) {
            qtyTotal = Math.ceil(qtyTotal / minInc) * minInc;
        }
        System.out.print("TOTAL QUANTITY: " + qtyTotal + "\n");
    }
}
