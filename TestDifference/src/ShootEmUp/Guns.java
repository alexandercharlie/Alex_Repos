/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ShootEmUp;

import java.util.Scanner;

/**
 *
 * @author Manjeet Kumar
 */
public class Guns {

    public void printSong() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Bullets in Your GUN");
        int gun = in.nextInt();
        while (gun > 0) {
            String verse = "";
            if (gun > 1) {
                verse += verseForNBullets(gun);
            } else {
                verse += finalVerse();
            }
            System.out.println(verse);
            gun--;
        }
    }

    public static void main(String[] args) {
        Guns nnb = new Guns();
        nnb.printSong();
    }

    private String verseForNBullets(int bullets) {
        if (bullets <= 0) {
            return "";
        }
        String verse = bullets + " bullets in GUN,\n"
                + "  1 Fired !!!\n";
        int bulletsLeft = bullets - 1;
        if (bulletsLeft > 1) {
            verse += bulletsLeft + " bullets Left in Gun !!!\n\n";
        } else {
            verse += "1 bullets Remaining!!!\n\n";
        }
        return verse;
    }

    private String finalVerse() {
        return "1 bullet Left in GUN,\n"
                + "1 Bullet !!!\n"
                + "   Load Gun,\n"
                + "   Fire !!!,\n"
                + "No more bullets in GUN!\n\n";
    }
}