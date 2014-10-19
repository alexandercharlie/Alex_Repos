/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PassingObjectReference;


/**
 *
 * @author Manjeet Kumar
 */
public class PassingObjectReference {

    public static void objectTest(TestMe tm) {
        tm.height = 6;
        tm.name = "alexander";
    }
    public static void objectYouTest(TestYou u)
    {
        u.height=88;
        u.name="Ali";
    }

    public TestMe createRecord(int n, String name) {
        TestMe r = new TestMe();
        r.height = n;
        r.name = name;
        return r;
    }

    public static void main(String[] args) {
        TestMe tme = new TestMe();
        tme.height = 5;
        tme.name = "veronika";
        objectTest(tme);
        System.out.println(tme.height + "   " + tme.name + "     ");
        TestYou u=new TestYou();
        u.height=90;
        u.name="Alex";
        objectYouTest(u); 
        System.out.println();

    }
}

class TestMe {

    int height;
    String name;
}
class TestYou{
    int height;
    String name;
}