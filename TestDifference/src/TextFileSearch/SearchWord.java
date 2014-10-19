/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TextFileSearch;

/**
 *
 * @author Manjeet Kumar
 */
import java.io.*;
import java.util.*;

public class SearchWord {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word to find: ");
        String word = input.next();
        if (word.equals("FAIL")) {
            File f = new File("record.txt");
            BufferedReader freader = new BufferedReader(new FileReader(f));
            String s;
            while ((s = freader.readLine()) != null) {

                String[] st = s.split(" ");
                String id = st[0];
                String name = st[1];
                String marks = st[2];
                String result = st[3];

                if (result.equals(word)) {
                    System.out.println(name + " : " + marks);
                    File file = new File("result.txt");

                    FileWriter fstream = new FileWriter(file, true);
                    BufferedWriter out = new BufferedWriter(fstream);
                    out.write(id + " " + name + " " + marks);
                    out.newLine();
                    out.close();
                }


            }
        }
    }
}