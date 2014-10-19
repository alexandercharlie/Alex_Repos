/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TreeMap;

/**
 *
 * @author Manjeet Kumar
 */
import java.util.*;

public class TreeMapDemo {

    public static void main(String[] me) {
        TreeMap tm = new TreeMap();
        //put elements to Map
        tm.put("Алекс", new Double(78945.456));
        tm.put("Алексий", new Double(68945.356));
        tm.put("Александр", new Double(58945.256));
        tm.put("Александров", new Double(48945.156));
        tm.put("Александрис", new Double(38945.056));
        tm.put("Алекстяпoв", new Double(28945.046));
        tm.put("Алексяпa", new Double(18945.036));
//get a set of entries
        Set set = tm.entrySet();
//get an iterator
        Iterator i = set.iterator();
//display elements
        while (i.hasNext()) {
            Map.Entry mapentry = (Map.Entry) i.next();
            System.out.print(mapentry.getKey() + ": ₱");// €
            System.out.println(mapentry.getValue());
        }
        System.out.println("-----Добро пожаловать на Александра и братья Банковские корпорация------");
        //Deposit $1000 more in Alex's account
        double balance = ((Double) tm.get("Алекс")).doubleValue();
        tm.put("Алекс", new Double(balance + 1000)+"   добавленный ₱1000 к Alex счет");
        System.out.println("Алекс новый баланс: " + tm.get("Алекс"));
    }
}
