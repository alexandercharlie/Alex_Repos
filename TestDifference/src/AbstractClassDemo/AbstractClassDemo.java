/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClassDemo;

/**
 *
 * @author Manjeet Kumar
 */
/*--> It's abstract class: It can have both abstract & concrete method
1. In Java an abstract class  is one that does not provide implementations for all its methods.
2.  A class must be declared abstract if any of the methods in that class are abstract.
3. An abstract class is meant to be used as the base class from which other classes are derived.
4. The derived class is expected to provide implementations for the methods that are not
implemented in the base class. A derived class that implements all the missing functionality is called a concrete class.
5. In Java it is not possible to instantiate an abstract class. 
 * 
 */
abstract class A {

    abstract void callme();//abstract method

    void callmetoo() { //normal method or say concrete method
        System.out.println("This is a concrete method.");
    }
}

abstract class test {

    void callWithoutInstantiating() {
        System.out.println("See I can be called without instantiating the Abstract class,since I'm method of abstract class");
    }
}

class B extends A { //this is derived class, 
    //so it'll implement abstract method-callme().Because it extends abstract class

    void callme() {
        System.out.println("B's implementation of callme.");
    }
}

class C extends test//this is derived class, 
//so it'll implement abstract method-callme().Because it extends abstract class
{

    void callme() {
        System.out.println("C's Implementing abstract class: Test. Method: call me");
    }
}

/*class D extends C  //Wrong: Since, This class needs to be abstract to have abstract methods.
{
abstract void callme1();
}
 * 
 */
public class AbstractClassDemo {

    public static void main(String args[]) {
        B b = new B();//class B is originally not abstract class
        C c = new C();//class C is originally not abstract class

        b.callme();
        c.callme();
        b.callmetoo();
        c.callWithoutInstantiating();

        // A a=new A();//this is wrong because abstract class can't be instantiated
    }
}