
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;

public class TestAny {

    public static void main(String[] unused) throws Exception {
        double totalExtHomeAmt = 0.0, totalOverageHomeAmt = 0.0, totalAtticStckAmt = 0.0, contingencyAmount = 0.0;
        double freight_amt = 0.0, tax_amt = 0.0, minQty = 0.0, minIncQty = 0.0, estimateQty = 0.0, itemPerCase = 0.0, totalQty = 0.0, taxOnFreight = 0.0;
        double atticStockQty = 0.0, unitPriceIncMarkup = 0.0, unitTrxPrice = 0.0, markUpPercent = 0.0, deliveredExtTrxAmnt = 0.0;
        double freightPercent = 0.0, taxPercent = 0.0, contingencyPercent = 0.0, atticStockAmount = 0.0;

        //TEMP VAL
        estimateQty = 150.0000000000;//40.0000000000;
        itemPerCase = 100.0000000000;//12.0000000000;
        minIncQty = 1.0000000000;//3.0;
        minQty = 1.0000000000;//3.0;
        totalQty = 3.0000000000;//6.0;
        markUpPercent = 4.0;
        unitTrxPrice = 10.0000000000;
        deliveredExtTrxAmnt = 10.00;

        if (estimateQty > 0) {
            estimateQty = estimateQty / itemPerCase;
        }
        if (estimateQty > 0) {
            if (minQty > 0) {
                if (estimateQty < minQty) {
                    estimateQty = minQty;
                } else if (estimateQty > minQty && minIncQty > 0) {
                    estimateQty = minQty + Math.ceil((estimateQty - minQty) / minIncQty) * minIncQty;
                }
            }
        }
        unitPriceIncMarkup = unitTrxPrice * (1 + markUpPercent / 100);
        atticStockQty = totalQty - estimateQty;
        atticStockAmount = atticStockQty * unitPriceIncMarkup;
        System.out.println("totalQty= " + totalQty + " estimateQty= " + estimateQty + " atticStockQty= " + atticStockQty + ""
                + " atticStockAmount= " + atticStockAmount);
        markUpPercent=4.0;
        System.out.println("EXT= "+(590* 522.91)*(1+markUpPercent/100));

    }
}
