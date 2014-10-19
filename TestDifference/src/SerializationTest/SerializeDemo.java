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
 * Serializing an Object:
 * The ObjectOutputStream class is used to serialize an Object.
 * The following SerializeDemo program instantiates an Employee object and serializes it to a file.
 * When the program is done executing, a file named employee.ser is created.
 * The program does not generate any output.
 */

public class SerializeDemo {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Alexander";
        e.age = 24;
        e.address = "London";
        e.mobile = 9811901;
        e.ssn = 1234;
        try {
            FileOutputStream fileOut = new FileOutputStream("Employee.ser");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(e);
            objOut.close();
            fileOut.close();
            System.out.println("Serialization done.....");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
