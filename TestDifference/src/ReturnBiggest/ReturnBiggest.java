/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ReturnBiggest;

/**
 *
 * @author Manjeet Kumar
 */
public class ReturnBiggest {
 // Returns the smallest integer in the supplied array
public int getMax() {
    int[] ints={2,3,4,5,6,12,7,89};
    int min = Integer.MIN_VALUE;
    for (int num : ints) {
        if (num > min) {
            min = num;
        }
    }
    return min;
}
    public static void main(String[] args)
    {
        ReturnBiggest rs=new ReturnBiggest();
        System.out.println("Biggest Integer is= "+rs.getMax());
    }
}