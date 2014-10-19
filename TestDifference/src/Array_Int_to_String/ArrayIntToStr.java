/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_Int_to_String;

import java.util.Arrays;

/**
 *
 * @author Manjeet Kumar
 */
public class ArrayIntToStr {

    public static void main(String[] args) {
        int num[] = new int[]{1, 2, 3, 4, 5};
        /*
         * First approach is to loop through all elements of an int array
         * and append them to StringBuffer object one by one. At the end,
         * use toString method to convert it to String.
         */
        StringBuffer sbf = new StringBuffer();
        String sepRator = ",";
        if (num.length > 0) {
            //we don't want leading space for 1st elements
            sbf.append(num[0]);

            /*
             * Loop through the elements of an int array. Please
             * note that loop starts from 1 not from 0 because we
             * already appended the first element without leading space.s  
             */
            for (int i = 0; i < num.length; i++) {
                sbf.append(sepRator).append(num[i]);
            }
            System.out.println("Int Array Converted to String Loop");
            System.out.println(sbf.toString());

            /*
             * Second options is to use Arrays class as given below.
             * Use Arrays.toString method to convert int array to String.
             * However, it will return String like [1, 2, 3, 4, 5]
             */
            String strNum = Arrays.toString(num);
            System.out.println("String generated from Arrays.toString() method=" + strNum);

            //Use Replace all to replace brackets and commas
            strNum = strNum.replaceAll(",", sepRator).replace("[", "").replace("]", "");
            System.out.println("Final String=" + strNum);
        }
    }
}
