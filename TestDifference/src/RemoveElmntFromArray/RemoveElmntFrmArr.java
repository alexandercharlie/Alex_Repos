/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RemoveElmntFromArray;

import java.util.ArrayList;

/**
 *
 * @author Manjeet Kumar
 */
public class RemoveElmntFrmArr {

    private static int arry[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void removeElt(int[] arr, int remIndex) {
        for (int i = remIndex; i < arr.length - 1; i++) {
            arr[ i] = arr[ i + 1];
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        removeElt(arry, 0);
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        num.add(arry[i]);
        }
        System.out.println(num);
    }
}
