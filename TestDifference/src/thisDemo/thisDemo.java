/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thisDemo;

/**
 *
 * @author Manjeet Kumar
 */
public class thisDemo {
    public int x=1;
    public int y=2;
    
    String[] l=new String[1];String[] m=new String[1];String[] n=new String[1];
    
   public thisDemo(int a,int b)
           {
               this.x=14;
               this.y=4;
           }
   public thisDemo(String a[],String b[],String c[])
   {
       this.l[0]=a[0];
       this.m[0]=b[0];
       this.n[0]=c[0];
   }
   public thisDemo()
   {
       
   }
    public static void main(String[] args)
    {
        thisDemo thi=new thisDemo(2, 3);
        System.out.println(thi.getClass());
        System.out.println(thi.x+" "+thi.y);
        
        thisDemo td=new thisDemo();
        System.out.println(td.getClass());
        System.out.println("x="+td.x+"y="+td.y);
        
        String xA[]={"a"};
        String yA[]={"b"};
        String zA[]={"c"};
       thisDemo tsd=new thisDemo(xA,yA,zA);
       System.out.println(tsd.getClass());
       System.out.println(tsd.l[0]+" "+tsd.m[0]+" "+tsd.n[0]);
    }

}
