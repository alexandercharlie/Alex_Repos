/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ScannerTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.MatchResult;

/**
 *
 * @author Manjeet Kumar
 */
/*
 * NOTE: A simple text scanner which can parse primitive types and strings using regular expressions.
 * A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace.
 * The resulting tokens may then be converted into values of different types using the various next methods.
 */
public class ScannerTest {

    public static void main(String[] args) throws FileNotFoundException {
        //The scanner can also use delimiters other than whitespace. This example reads several items in from a string:
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");//this will delimit fish from string
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();
        //The same output can be generated with this code, which uses a regular expression to parse all four tokens at once:
        System.out.println("<==break-------------------------------------------------------break==>");
        String input2 = "1 fish 2 fish red fish blue fish";
        Scanner s2 = new Scanner(input2);
        s2.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
        MatchResult result = s2.match();
        for (int i = 1; i <= result.groupCount(); i++) {
            System.out.println(result.group(i));
        }
        s2.close();

    }
}
