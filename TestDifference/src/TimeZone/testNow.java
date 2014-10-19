/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TimeZone;

/**
 *
 * @author Manjeet Kumar
 */
import java.util.*;

public class testNow {

    public static void main(String[] args) {

        String city = "Europe/Sofia ";
        //String s = "prefix/dir1/dir2/dir3/dir4";
        String[] tokens = city.split("/");
        List findIn = Arrays.asList(tokens);

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Name");
        String sf=in.next();
        for (int i = 0; i < findIn.size(); i++) {
            String m = (String) findIn.get(i);
            if(m.equalsIgnoreCase(sf))
            System.out.println("Found :"+sf);
        }
        for (String t : tokens) {
            if(t.equalsIgnoreCase(sf))
            System.out.println("Match: " + sf);
        }
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equalsIgnoreCase(sf))
            {
                System.out.println("Found It: "+sf);
            }
        }
        /*
        String acct_Rte_Cdes_A_Array[] = {"X", "Y", "Z", "A", "B", "C", "F", "E"};
        String acct_Rte_Cdes_B_Array[] = {"J", "K", "D", "G", "Q", "L", "M"};
        
        List acct_Rte_Cdes_A = Arrays.asList(acct_Rte_Cdes_A_Array);
        List acct_Rte_Cdes_B = Arrays.asList(acct_Rte_Cdes_B_Array);
        
        System.out.println(acct_Rte_Cdes_A);
        
        
        if (acct_Rte_Cdes_A.contains(acct_Rte_Cdes_A_Array)) {
        System.out.println("Match");
        } else if (acct_Rte_Cdes_B.contains(acct_Rte_Cdes_B_Array)) {
        System.out.println("Match Match");
        }
        
        
        
         * 
         */
    }
}
