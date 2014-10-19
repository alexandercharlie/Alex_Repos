/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateTaxAndFreight;

/**
 *
 * @author Manjeet Singh
 */
public class CalculateTaxAndFreight {
        public static void main(String[] args) {
     double attickQty=1;
    double estimateQty=10;
    double minIncQty=4;
    double minOrderQty=2;
    double totalQty=attickQty+estimateQty;
    if (totalQty > 0) {
        if (minOrderQty > 0) {
            if (totalQty < minOrderQty) {
                totalQty = minOrderQty;
            } else if (totalQty > minOrderQty && minIncQty > 0) {
                totalQty = minOrderQty + (Math.ceil((totalQty - minOrderQty) / minIncQty)) * minIncQty;
            }
        }
    }
    System.out.print(totalQty); 
       }
}
