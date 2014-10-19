/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodCalling;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manjeet Kumar
 */
public class MethodCalling extends DistanceConverter {

    String opt = "Welcome to Application !!!"
            + "\n What Would you Like to do?\n"
            + "If You want to Use Distance Converter Press '1'\n"
            + "If You want to Use Weight Converter Press '2'\n"
            + "If You want to Use Area Calculator Press '3'\n";

    public static void main(String[] args) {
        MethodCalling mCall = new MethodCalling();
        mCall.authorized();
        mCall.opt();
        mCall.cont();
    }

    public void opt() {
        System.out.println(opt);
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        if (choice.equals("1")) {
            DistanceConverter dconn = new DistanceConverter();
            dconn.dist();
        } else if (choice.equals("2")) {
            WeightConverter wc = new WeightConverter();
            wc.WeightConvert();
        } else if (choice.equals("3")) {
            AreaCalculator ac = new AreaCalculator();
            ac.areaCalc();
        }

    }

    public double KmToM(double kiloMeter) {
        double meter = kiloMeter * 1000;
        return meter;
    }

    public double MoCM(double meters) {
        double cm = meters * 100;
        return cm;
    }

    public double CMtoMM(double cm) {
        double mm = cm * 1000;
        return mm;
    }

    public void authorized() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name Please: ");
        String name = sc.next();

        if (name.equalsIgnoreCase("manjeet")) {
            System.out.println("You are BOSS, So you are authorized");



        } else if (!name.equalsIgnoreCase("manjeet")) {
            System.out.println("Your are " + name + " You are not Authorized");
            System.exit(0);
        }
    }

    public void cont() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Would You Like to Continue Enter 'Y' for YES & 'N' for NO");
        String yes = sc.next();
        if (yes.equalsIgnoreCase("y")) {
            opt();
        } else if (yes.equalsIgnoreCase("n")) {
            System.out.println("Good Bye");
            System.exit(0);
        }
    }
}
