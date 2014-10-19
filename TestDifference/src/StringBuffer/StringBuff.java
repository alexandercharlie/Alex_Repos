/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringBuffer;

/**
 *
 * @author Manjeet Kumar
 */
public class StringBuff {
  public static void main(String[] argv) throws Exception {
  StringBuffer buf = new StringBuffer("This is a test For the Real java Developer, Try yourself. And see I am increasing capacity");

    int start = 27;
    int end = 34;
    buf.replace(start, end, "4");
    System.out.println(buf);
    System.out.println("Capacity="+buf.capacity());
    System.out.println("Length="+buf.length());
    
    //Another Test
    StringBuffer sb = new StringBuffer("Hello World");
    System.out.println("Original Text : " + sb);
   
    /*
     To replace the contents of Java StringBuffer use
     StringBuffer replace(int start, int end, String str) method.
     It replaces the content from StringBuffer string from start index
     to end - 1 index by the content of the String str.
    */
    sb.replace(0,5,"Hi");
    System.out.println("Replaced Text : " + sb);
    
    //String Buffer reverse example
    StringBuffer sbrev = new StringBuffer("Java StringBuffer Reverse Example");
    System.out.println("Original StringBuffer Content : " + sbrev);
   
    //To reverse the content of the StringBuffer use reverse method
    sbrev.reverse();
    System.out.println("Reversed StringBuffer Content : " + sbrev);
    
    //String buffer substring example
     StringBuffer sbSubstr = new StringBuffer("Java StringBuffer SubString Example");
    System.out.println("Original Text : " + sbSubstr);
 
    /*
     SubString method is overloaded in StringBuffer class
     1. String substring(int start)
     returns new String which contains sequence of characters contined in
     StringBuffer starting from start index to StringBuffer.length() - 1 index
    */
    String strPart1 = sbSubstr.substring(5);
    System.out.println("Substring 1 : " + strPart1);
 
    /*
     2. String substring(int start, int end)
     returns new String which contains sequence of characters contined in
     StringBuffer starting from start index to end index
    */
    String strPart2 = sbSubstr.substring(0,17);
    System.out.println("Substring 2 : " + strPart2);
   
    /* Please note that both the methods can throw a StringIndexOutOfBoundsException
       if start or end is invalid.
     * 
     */
    //Append Test on various Parameters
    
     //StringBuffer append(boolean b) method appends boolean to StringBuffer object
    boolean b = true;
    StringBuffer sb1 =  new StringBuffer("BooelanAppended : ");
    sb1.append(b);
    System.out.println(sb1);
   
    //StringBuffer append(char c) method appends character to StringBuffer object
    char c = 'Y';
    StringBuffer sb2 =  new StringBuffer("CharAppended : ");
    sb2.append(c);
    System.out.println(sb2);
   
    /*StringBuffer append(char[] c) method appends character array
    to StringBuffer object*/
    char[] c1 = new char[] {'Y','e','s'};
    StringBuffer sb3 =  new StringBuffer("Character Array Appended : ");
    sb3.append(c1);
    System.out.println(sb3);
 
    //StringBuffer append(double d) method appends double to StringBuffer object
    double d = 1.0;
    StringBuffer sb4 =  new StringBuffer("doubleAppended : ");
    sb4.append(d);
    System.out.println(sb4);
   
    //StringBuffer append(float f) method appends float to StringBuffer object
    float f = 1.0f;
    StringBuffer sb5 =  new StringBuffer("floatAppended : ");
    sb5.append(f);
    System.out.println(sb5);
 
    //StringBuffer append(int i) method appends integer to StringBuffer object
    int i = 1;
    StringBuffer sb6 =  new StringBuffer("integerAppended : ");
    sb6.append(i);
    System.out.println(sb6);
 
    //StringBuffer append(long l) method appends long to StringBuffer object
    long l = 1;
    StringBuffer sb7 =  new StringBuffer("longAppended : ");
    sb7.append(l);
    System.out.println(sb7);
 
    //StringBuffer append(Object o) method appends Object to StringBuffer object
    /* NOTE : Objects are first converted to a String and then it is
    appended to StrinBuffer */
    Object obj = new String("Yes");
    StringBuffer sb8 =  new StringBuffer("ObjectAppended : ");
    sb8.append(obj);
    System.out.println(sb8);
   
    //StringBuffer append(String str) method appends String to StringBuffer object
    String str = new String("Yes");
    StringBuffer sb9 =  new StringBuffer("StringAppended : ");
    sb9.append(str);
    System.out.println(sb9);
    
    //String Buffer Delete Methods
      /*
      Java StringBuffer class following methods to delete / remove characters
      or claring the contents of a StringBuffer object.
    */
   
    /*
     StringBuffer delete(int start, int end) remove the characters from start
     index to an end-1 index provided.
     This method can throw a StringIndexOutOfBoundException if the start
     index is invalid.
    */
    StringBuffer sbd1 = new StringBuffer("Hello World");
    sbd1.delete(0,6);
    System.out.println("Now sbd1="+sbd1);
   
    /*
     To clear contents of a StringBuffer use delete(int start, int end) method
     in the below given way
    */
    StringBuffer sbd2 = new StringBuffer("Some Content");
    System.out.println(sbd2);
    System.out.println("length="+sbd2.length());
    sbd2.delete(0, sbd2.length());
    System.out.println(sbd2);
   
    /*
     StringBuffer deleteCharAt(int index) deletes the character at specified
     index.
     This method throws StringIndexOutOfBoundException if index is negative
     or grater than or equal to the length.
    */
    StringBuffer sbd3 = new StringBuffer("Hello World");
    sbd3.deleteCharAt(2);
    System.out.println(sbd3);
    
    
    //Stringbuffer Insert method
     /*
     * Java StringBuffer class provides following methods to insert various
     primitive values and objects to StringBuffer object at specified offset.
    */
   
    /*
     StringBuffer insert(int offset, boolean b) method inserts
     boolean to StringBuffer object at specified offset
    */
    boolean bi = true;
    StringBuffer sbi1 =  new StringBuffer("Hello  World");
    sbi1.insert(6,bi);
    System.out.println(sbi1);
 
    /*
     StringBuffer insert(int offset, char c) method inserts
     character to StringBuffer object at specified offset
    */
    char ci = 'Y';
    StringBuffer sbi2 =  new StringBuffer("Hello  World");
    sbi2.insert(6,ci);
    System.out.println(sbi2);
 
 
    /*
     StringBuffer insert(int offset, char[] c1) method inserts
     character array to StringBuffer object at specified offset
    */
    char[] cIns = new char[] {'Y','e','s'};
    StringBuffer sb3i =  new StringBuffer("Hello  World");
    sb3i.insert(6,cIns);
    System.out.println(sb3i);
 
 
    /*
     StringBuffer insert(int offset, double d) method inserts
     double to StringBuffer object at specified offset
    */
    double di = 1.0;
    StringBuffer sb4i =  new StringBuffer("Hello  World");
    sb4i.insert(6,di);
    System.out.println(sb4i);
 
 
    /*
     StringBuffer insert(int offset, float f) method inserts
     float to StringBuffer object at specified offset
    */
    float fi = 2.0f;
    StringBuffer sb5i =  new StringBuffer("Hello  World");
    sb5i.insert(6,fi);
    System.out.println(sb5i);
 
 
    /*
     StringBuffer insert(int offset, int i) method inserts
     integer to StringBuffer object at specified offset
    */
    int in = 5;
    StringBuffer sbi6 =  new StringBuffer("Hello  World");
    sbi6.insert(6,in);
    System.out.println(sbi6);
 
 
    /*
     StringBuffer insert(int offset, long l) method inserts
     long to StringBuffer object at specified offset
    */
    long li = 10;
    StringBuffer sbi7 =  new StringBuffer("Hello  World");
    sbi7.insert(6,li);
    System.out.println(sbi7);
   
    /*
     StringBuffer insert(int offset, Object obj) method inserts
     Object to StringBuffer object at specified offset
    */
    Object obji = new String("My");
    StringBuffer sbi8 =  new StringBuffer("Hello  World");
    sbi8.insert(6,obji);
    System.out.println(sbi8);
 
    /*
     StringBuffer insert(int offset, String str) method inserts
     String to StringBuffer object at specified offset
    */
    String stri = "New";
    StringBuffer sbi9 =  new StringBuffer("Hello  World");
    sbi9.insert(6,stri);
    System.out.println(sbi9);
   
    /*
     NOTE: Above all method throws StringIndexOutOfBoundsException if the
     offset is less than 0 or grater than length of StringBuffer object.  
    */
  }
}