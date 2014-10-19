/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ReturnSmallest;

/**
 *
 * @author Manjeet Kumar
 */
public class ReturnSmallest {
 // Returns the smallest integer in the supplied array
public int getMin() {
    int[] ints={2,3,4,5,6,12,7,89};
    int min = Integer.MAX_VALUE;
    for (int num : ints) {
        if (num < min) {
            min = num;
        }
    }
    return min;
}
    public static void main(String[] args)
    {
        ReturnSmallest rs=new ReturnSmallest();
        System.out.println("Smallest Integer is= "+rs.getMin());
    }
}
