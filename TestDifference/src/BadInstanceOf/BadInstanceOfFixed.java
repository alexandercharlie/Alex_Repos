/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BadInstanceOf;

/**
 *
 * @author Manjeet Kumar
 */
/**
* Using polymorphism to call different methods.
* Does not use instanceof.
*/
public final class BadInstanceOfFixed {

  public static void main(String... aArgs){
    log("Starting...");
     Animal animal = new Animal();
     doSomething(animal);
     
     //repoint the same 'animal' reference to other objects :
     
     animal = new Fish();
     doSomething(animal);
     
     animal = new Spider();
     doSomething(animal);
     
     log("Done.");
  }

  /**
  * This method implementation doesn't care at all 
  * about Fish/Spider. It just knows that it has 
  * been passed an Animal. Different versions of 
  * 'move' are called, specific to each Animal. 
  */
  public static void doSomething(Animal aAnimal){
    aAnimal.move();
  }

  // PRIVATE //
  private static class Animal {
    void move(){
      log("Move like an animal...");
    }
  }

  private static final class Fish extends Animal {
        @Override
    void move(){
      log("Move like a fish...");
    }
  }
  private static final class Spider extends Animal {
        @Override
    void move(){
      log("Move like a spider...");
    }
  }

  private static void log(String aMessage){
    System.out.println(aMessage);
  }
} 