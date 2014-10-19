/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manjeet Singh
 */
public class Tester {

    public static void main(String[] args) {
        double qty[] = {40};
        double qtyTotal = 0;
        double prevQtyTotal=0;
        double minQty = 2;
        double minInc = 20;
        
        System.out.println(1/0);

        for (int i = 0; i < qty.length; i++) {
            qtyTotal += qty[i];
            prevQtyTotal+=qty[i];
            if (qtyTotal > 0) {
                if (qtyTotal <= minQty) {
                    qtyTotal = minQty;
                    prevQtyTotal=minQty;
                } else if (qtyTotal > minQty && minInc > 0) {
                    qtyTotal =Math.ceil(qtyTotal / minInc) * minInc;// minQty + Math.ceil((qtyTotal-minQty)/minInc)*minInc;//
                prevQtyTotal=minQty + Math.ceil((prevQtyTotal-minQty)/minInc)*minInc;
                }
            }
        }
        System.out.println(qtyTotal+" "+prevQtyTotal);
    }
}
