/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listOP;

/**
 *
 * @author Manjeet Kumar
 */
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;//whatever size you wish

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("ManOutFile.txt"));
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
            }
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ListOfNumbers.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
    }
public static void main(String[] args)
{
    ListOfNumbers lnum=new ListOfNumbers();
    lnum.writeList();
    System.out.println(lnum.list);
}
}
