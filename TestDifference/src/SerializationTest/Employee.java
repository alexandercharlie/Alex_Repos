/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SerializationTest;

/**
 *
 * @author Manjeet Kumar
 */
/*We are Trying to implement serialization here:
 *Java provides a mechanism, called object serialization where an object can be represented as a sequence of bytes.
 * This Byte includes the object's data as well as information about the object's type and the types of data stored in the object.
 * After a serialized object has been written into a file, it can be read from the file and deserialized.
 * Which means that bytes which represent the object and its data can be used to recreate the object in memory.
 * Most impressive is that the entire process is JVM independent, meaning an object can be serialized on one platform and deserialized on an entirely different platform.
 * Classes ObjectInputStream and ObjectOutputStream are high-level streams that contain the methods for serializing and deserializing an object.
 */
public class Employee implements java.io.Serializable{
   public String name;
   public int age;
   public String address;
   public transient int ssn;
   public long mobile;
   
   public void mailCheck()
   {
       System.out.println("Mailing a Check to " +name+" Address: "+address);
   }
}
/*
 * Notice that for a class to be serialized successfully, two conditions must be met:
        The class must implement the java.io.Serializable interface.
        All of the fields in the class must be serializable. If a field is not serializable, it must be marked transient.
 
 * Transient: Transient modifier tells that When an instance variable is declared as transient, then its value need not persist when an object is stored.
 * Volatile: volatile modifier tells the compiler that the variable modified by volatile can be changed unexpectedly by other parts of your program.
 */
