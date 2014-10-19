/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixArray;

import java.util.ArrayList;

/**
 *
 * @author Manjeet Singh
 */
public class MatrixArray {

    public static void main(String[] array) {
        
        int row = 0;
        int cols = 0;   
        String result[][][]=test();
        System.out.println(result[0][0][0]);
        System.out.println(result[1][0][0]);
        System.out.println(result[2][0][0]);
        System.out.println(result[3][0][0]);

        System.out.println(result[0][0][0]);
        System.out.println(result[0][1][0]);
        System.out.println(result[0][2][0]);
        System.out.println(result[0][3][0]);

        System.out.println(result[0][0][0]);
        System.out.println(result[0][0][1]);
        System.out.println(result[0][0][2]);
        System.out.println(result[0][0][3]);

//        for(int j=0;j<test().length;j++){
//        row++;
//        cols++;
//        }
    }
    public static String[][][] test()
    {
        ArrayList arr=new ArrayList();
        int numRows = 0;
        int numColumns = 0;
        
        String[] sArray = { "a", " b", "c","d","e","f","g","h","i","j","k","l" };
        int actualLen=sArray.length/3;
        String[][][] a = new String[actualLen][actualLen][actualLen];
        a[0][0][0]=sArray[0];
        a[1][0][0]=sArray[1];
        a[2][0][0]=sArray[2];
        a[3][0][0]=sArray[3];
        
        a[0][0][0]=sArray[4];
        a[0][1][0]=sArray[5];
        a[0][2][0]=sArray[6];
        a[0][3][0]=sArray[7];
        
        a[0][0][0]=sArray[8];
        a[0][0][1]=sArray[9];
        a[0][0][2]=sArray[10];
        a[0][0][3]=sArray[11];
        
return a;
    }
}
