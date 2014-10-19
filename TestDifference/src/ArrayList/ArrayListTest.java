/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author Manjeet Kumar
 */
import java.util.ArrayList;
public class ArrayListTest {
public static void main(String[] args)
{
    ArrayList arrlst=new ArrayList();
     /*
       Add elements to Arraylist using
       boolean add(Object o) method. It returns true as a general behavior
       of Collection.add method. The specified object is appended at the end
       of the ArrayList.
         */
        arrlst.add("0");
        arrlst.add("1");
        arrlst.add("2");
        arrlst.add("3");
        arrlst.add("4");
        arrlst.add("5");
        System.out.println("Getting Elements out of Array List");
        System.out.println(arrlst.get(0) + "" + arrlst.get(1) + "" + arrlst.get(2) + "" + arrlst.get(3) + "" + arrlst.get(4) + "" + arrlst.get(5));
//=============== OR =================
    for (int i = 0; i < arrlst.size(); i++) {
        System.out.println(arrlst.get(i));
    }int i=0;
   while(arrlst.iterator().hasNext())
    {i++;
        System.out.println(arrlst.get(i));
    }

}
}
