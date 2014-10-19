/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author Manjeet Singh
 */
public class ArrayListTest1 {
    public static void main(String[] args)
{
    ArrayList arrlst=new ArrayList();
    for(int i=0;i<3;i++)
    {
        arrlst.add(0);
    }
    if(arrlst.get(0).equals(1))
    System.out.println(arrlst.get(0)); 
}
}
