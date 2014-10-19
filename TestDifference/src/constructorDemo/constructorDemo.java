/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorDemo;

/**
 *
 * @author Manjeet Kumar
 */
public class constructorDemo {

    public int gear = 0;
    public int cadence = 0;
    public int speed = 0;

    public constructorDemo(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    public static void main(String[] args) {
        constructorDemo cd = new constructorDemo(4, 20, 1);
        System.out.println("Gear=" + cd.gear + " Cadence=" + cd.cadence + " Speed=" + cd.speed);
        constructorDemo cdDem = new constructorDemo();
        System.out.println("Gear=" + cdDem.cadence + " Cadence=" + cdDem.gear + " Speed=" + cdDem.speed);
        //extended class
        Sub s = new Sub(22, 21, 20);
        System.out.println("Cadence=" + s.cadence + " Speed=" + s.speed + " Gear=" + s.gear);
        Sub su = new Sub();
        System.out.println("Cadence=" + su.cadence + " Speed=" + su.speed + " Gear=" + su.gear);
    }

    public constructorDemo() {
        gear = 2;
        cadence = 34;
        speed = 40;
    }
}

class Sub extends constructorDemo {

    public Sub(int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
    }

    public Sub() {
        super();//it's optional
    }
}
