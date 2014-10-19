/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TenShots;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Manjeet Kumar
 */
public class TenShots {

    public static void main(String[] args) {
        ArrayList<Integer> bulletsArr = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        System.out.println("How many Bullets You want in Your GUN (e.g 5,7,10,15,30,...");
        int bullet = in.nextInt();
        int bulletBelt[] = new int[bullet];
        System.out.println("Fill bullets");
        for (int i = 0; i < bullet; i++) {
            bulletBelt[i] = in.nextInt();
            bulletsArr.add(bulletBelt[i]);
        }
        System.out.println("Your Belt: " + bulletsArr);
        System.out.println("Press F=Fire | E=Exit");
        String choice = in.next();
        if (choice.equalsIgnoreCase("f")) {
            fire(bulletBelt, 0);
              if (bulletsArr.isEmpty()) {
                System.out.println("Your Belt is Empty:" + bulletsArr);

            }
        } else {
            System.out.println("BYE");
            System.exit(0);
        }

    }

    public static void fire(int[] arr, int remIndex) {
        for (int i = remIndex; i < arr.length - 1; i++) {
            arr[ i] = arr[ i + 1];
            remIndex++;

        }
    }
}
