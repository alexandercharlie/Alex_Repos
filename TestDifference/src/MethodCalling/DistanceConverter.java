/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodCalling;

import java.util.Scanner;

/**
 *
 * @author Manjeet Kumar
 */
public class DistanceConverter {
    /*
    public static void main(String[] args)
    {
    DistanceConverter dc=new DistanceConverter();
    dc.dist();
    }
     */ public void dist() {
        Scanner sc = new Scanner(System.in);

//        String value = JOptionPane.showInputDialog("KM to Meter Converter\n Enter the Distance in Kilometer");
        System.out.println("Enter the distance in KM");
        int dist = sc.nextInt();

        double result = dist * 1000;
        System.out.println("Distance in Meter is: " + result);
        System.out.println("Distance in CentiMeter is: " + result * 100);
        MethodCalling mc=new MethodCalling();
        mc.cont();

    }
}

class WeightConverter {

    public void WeightConvert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in KG");
        double kg = sc.nextDouble();
        double weightTotal = kg * 1000;
        System.out.println("Your Weight in Grams: " + weightTotal);
        System.out.println("Your Weight in MiliGrams: " + weightTotal * 1000);
MethodCalling mc=new MethodCalling();
        mc.cont();


    }
}
class AreaCalculator
{
    public AreaCalculator()
    {
        super();
    }
    public void areaCalc()
    {
 
           Scanner sc=new Scanner(System.in);
  System.out.println("Enter the shape You wish to calculate");
           String shape=sc.next();
  if(shape.equalsIgnoreCase("rectangle"))
  {
      System.out.println("Enter Length");
      int len=sc.nextInt();
      System.out.println("Enter width");
      int width=sc.nextInt();
      int area=len*width;
      System.out.println("Area of Rectangle is: "+area);
      MethodCalling mc=new MethodCalling();
        mc.cont();
        }
  else if(shape.equalsIgnoreCase("square"))
  {
      System.out.println("Enter Length of any Side");
      int len=sc.nextInt();
      int area=len*len;
      System.out.println("Area of Square is: "+area);
      MethodCalling mc=new MethodCalling();
        mc.cont();
  }
  else if(shape.equalsIgnoreCase("circle"))
  {
      System.out.println("Enter radius of circle");
      int rad=sc.nextInt();
      int area=(int) (Math.PI*(rad*rad));
      System.out.println("Area of Circle="+area);
      MethodCalling mc=new MethodCalling();
        mc.cont();
  }
    }
 
}
