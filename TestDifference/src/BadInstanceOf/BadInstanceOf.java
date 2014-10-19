/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BadInstanceOf;

/**
 *
 * @author Manjeet Kumar
 */
public final class BadInstanceOf {

    public static void doSomething(Animal aAnimal) {
        if (aAnimal instanceof Fish) {
            Fish fish = (Fish) aAnimal;
            fish.swim();
        } else if (aAnimal instanceof Spider) {
            Spider spider = (Spider) aAnimal;
            spider.crawl();
        }
    }

    // PRIVATE //
    private static class Animal {
    }

    private static final class Fish extends Animal {

        void swim() {
            System.out.println("Swimming....");
        }
    }

    private static final class Spider extends Animal {

        void crawl() {
            System.out.println("Crawling....");
        }
    }

    public static void main(String[] args) {//Animal animal=new Animal();
        Fish f = new Fish();
        Spider s = new Spider();
        if (f instanceof Animal) {
            System.out.println("Fish is also animal");
            doSomething(f);
        }
        if (s instanceof Animal) {
            System.out.println("Spider is also Animal");
            doSomething(s);
        }
    }
}