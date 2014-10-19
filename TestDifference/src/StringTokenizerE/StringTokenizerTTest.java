/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringTokenizerE;

import java.util.StringTokenizer;

/**
 *
 * @author Manjeet Singh
 */
public class StringTokenizerTTest {

    public static void main(String[] args) {
        String line = "areaCode@@@@date@@areaDesc@@@@capexYear";
        //        alert("areaCode "+areaCode+" requiredBy="+requiredByValue+" date "+renovatedYrValue+" areaDesc "+areaDesc+" priority "+priorityValue+" capexYear "+capexYearValue);
        String delim = ",";
        String token = "";
        int count=0;
        String record[]=new String[12]; 
        StringTokenizer stVals = new StringTokenizer(line, delim, true);

        while (stVals.hasMoreTokens()) {
            token = stVals.nextToken();
            if(token.equals(delim))
                record[count++]="";
            else
                record[count++]=token;
//            System.out.println(token);
        }
//        for(int t=0;t<record.length;t++)
//            System.out.println(record[t]);
        String arrayLine[]=line.split("@@");
        for(int x=0;x<arrayLine.length;x++)
            System.out.println(arrayLine[x]+" = ");
        
        
    }
}
