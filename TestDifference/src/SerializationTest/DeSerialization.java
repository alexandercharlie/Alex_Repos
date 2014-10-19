/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SerializationTest;

/**
 *
 * @author Manjeet Kumar
 */
import java.io.*;
/*
 * Deserializing an Object:
 * The following DeserializeDemo program deserializes the Employee object created in the SerializeDemo program.
 */
public class DeSerialization {
public static void main(String[] args)
{
    Employee e=null;
    try{
        FileInputStream fileIn=new FileInputStream("employee.ser");
        ObjectInputStream objIn=new ObjectInputStream(fileIn);
        e=(Employee)objIn.readObject();
        objIn.close();
        fileIn.close();
    }
    catch(IOException ioe)
    {
        ioe.printStackTrace();
    }
    catch(ClassNotFoundException cnfe)
    {
        cnfe.printStackTrace();
    }
    System.out.println("Deserialized Employee...");
    System.out.println("Name: "+e.name);
    System.out.println("Age: "+e.age);
    System.out.println("Mobile: "+e.mobile);
    System.out.println("Address: "+e.address);
    System.out.println("SSN:"+e.ssn);
    }
}
