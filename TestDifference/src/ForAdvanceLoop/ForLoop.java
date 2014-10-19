/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ForAdvanceLoop;

/**
 *
 * @author Manjeet Kumar
 */
public class ForLoop {
       public int[] arry = new int[10];
     public static void main(String[] args)
    {
        String[] myArray = { "abc", "def", "ghi" };  
        
       int[] anArray = { 
    100, 200, 300,
    400, 500, 600, 
    700, 800, 900, 1000
};
       char ch[]={'a','b','c','d','e','f','g'};
       

   
//standard for loop, using array indexes...  
boolean t=false;
for(int x = 0; x < myArray.length; x++) {  
  System.out.println("Standard For Loop="+myArray[x]);  
     t=x==myArray.length-1?true:false;
    if(t) System.out.println(x+"      "+t);
}  
System.out.println("==================="+(myArray.length));
   
//enhanced for loop, for each String in myArray...  
for( String s : myArray ) {  
  System.out.println("Advance For Loop="+s);  //You can use For with opening and close brace or without it
}

for(int num:anArray)
    System.out.println("Integer Array="+num);
    
    for(char test:ch)
        System.out.println("Character array="+ch[0]+ch[1]+ch[2]+ch[3]+ch[4]+ch[5]+ch[6]);
   

    
    }
}
