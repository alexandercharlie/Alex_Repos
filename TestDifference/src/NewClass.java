
import java.io.IOException;
import java.util.Vector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manjeet Singh
 */
class DoWhileDemo {
    private static int xx=1;
    public static void main(String[] args){
        int x=0;
        boolean b=false;
        while(x<7){
        while(x<15){
            x++;
        if(x==8){
            b=true;
            break;
        }
        else
            System.out.println(x); 
        }
        break;
        }
    }
}