/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AreaOfCircle;

import java.util.Scanner;

/**
 *
 * @author Manjeet Kumar
 */
public class AreaOfCircle {
    // Fraction f = new Fraction(1, 3);    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Radius or Diameter of circle.\nIf you know Radius Enter 'R' else 'D' for Diameter");
        String str = in.next();
        if (str.equalsIgnoreCase("r")) {
            System.out.println("Please Enter Radius");
            float radius = in.nextFloat();

            float circumference = (float) (2 * Math.PI * radius);
            float area = (float) (Math.PI * radius * radius);
            float sphereSurfaceArea = (float) (4 * Math.PI * radius * radius);
            float sphereVolume = (float) ((4 / 3f) * Math.PI * radius * radius * radius);
            System.out.println("Circumference=" + circumference + " \nArea Of circle is=" + area + ""
                    + " \nSphere Surface Area=" + sphereSurfaceArea + " \nsphereVolum=" + sphereVolume);
        } else if (str.equalsIgnoreCase("d")) {
            System.out.println("Please Enter Diameter");
            float diameter = in.nextFloat();
            float circumference = (float) (Math.PI * diameter);
            float area = (float) ((1 / 4f) * Math.PI * diameter * diameter);
            float sphereSurfaceArea = (float) (Math.PI * diameter * diameter);
            float sphereVolume = (float) ((Math.PI * diameter * diameter * diameter) / 6);
            System.out.println("Circumference=" + circumference + " \nArea Of circle is=" + area + ""
                    + " \nSphere Surface Area=" + sphereSurfaceArea + " \nsphereVolum=" + sphereVolume);
        }
        System.out.println("Do you want to calculate partially filled sphere Volumes and Area? Enter Y or N");
        String agree = in.next();
        if (agree.equalsIgnoreCase("y")) {
            System.out.println("Enter R if You know Radius else D for Diameter");
            String choice = in.next();
            if (choice.equalsIgnoreCase("r")) {
                System.out.println("Enter Radius of Paritally Filled Sphere");
                float radius = in.nextFloat();
                System.out.println("Enter Hieght of Partially filled sphere");
                float height = in.nextFloat();
                float liquidVolume = (float) (((4 * Math.PI * radius * radius * radius) / 3) - (Math.PI * height * height * (3 * radius - height)) / 3);
                float liquidArea = (float) ((4 * Math.PI * radius * radius) - (2 * Math.PI * radius * height));
                System.out.println("Liquid Volume=" + liquidVolume + " Liquid Area=" + liquidArea);
            } else if (choice.equalsIgnoreCase("d")) {
                System.out.println("Enter the Diameter of Partially Filled Sphere");
                float d = in.nextFloat();
                System.out.println("Enter the Height of Partially Filled Sphere");
                float h = in.nextFloat();
                float liquidVolume = (float) (((Math.PI * d * d * d) / 6) - ((d * Math.PI * h * h) / 2 + (Math.PI * h * h * h) / 3));
                float liquidArea = (float) ((Math.PI * d * d) - (Math.PI * d * h));
                System.out.println("Liquid Volume=" + liquidVolume + " Liquid Area=" + liquidArea);
            } else if (!choice.equalsIgnoreCase("r") || !choice.equalsIgnoreCase("d")) {
                System.out.println("Wrong Choice !!!");
                System.exit(0);
            }
        } else if (agree.equalsIgnoreCase("n")) {
            System.out.println("Bye !");
            System.exit(0);
        }
        else if(!agree.equalsIgnoreCase("y")||(!agree.equalsIgnoreCase("n")))
        {
            System.out.println("Please Enter Y or N only");
        }

    }
}
