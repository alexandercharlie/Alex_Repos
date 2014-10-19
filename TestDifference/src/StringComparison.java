/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manjeet Singh
 */
public class StringComparison {

    public static void main(String[] args) {
        String helloWorld = "Hello World";
        System.out.println(helloWorld=="Hello World");
        ;;System.out.println(helloWorld.intern()=="Hello World");
        "Hello World".equals(helloWorld);
        System.out.println("Hello World".equals(helloWorld));
        
        System.out.println("************************************************************");
        String s = "Hello";
        int i=1;
        System.out.println(s.intern()=="Hello");
        if(s=="Hello"){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if(s.equals("Hello")){
            System.out.println("equal true");
        }else{
            System.out.println("equal false");
        }
String s1="Hello1";
String s2=new String("Hello1");
System.out.print(s1==s2);
    }
}
