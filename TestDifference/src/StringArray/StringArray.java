/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringArray;

/**
 *
 * @author Manjeet Singh
 */
public class StringArray {
    public static void main(String[] argv)
    {
        double total=0;
        String aa[]={"INV1 ","INV2 ","INV3 ","INV4 ","INV5 "};
        double dd[]={10.20,22.29,23.23,567.890,897.56};
        StringBuffer sb=new StringBuffer();
//        for(int i=0;i<aa.length;i++)
//        {
//            total+=dd[i];
//            sb.append(aa[i].trim()).append(",");
//            
//            if(i==(aa.length-1)){
//            System.out.println(sb.deleteCharAt(sb.length()-1));
//            System.out.println(total);
//            }
//            }System.out.println(sb.toString());
        
//            for(int i=0;i<aa.length;i++)
//        {
//            sb.append(aa[i].trim()).append("','");
//            }
//            sb.replace(sb.length()-2,sb.length(),"").insert(0,"'");
//            //sb.toString().trim();
//            //sb.insert(0,"'");
//            System.out.println(sb.toString().trim());
        sb.append("''test0','test1','test2','test3','test4'");
        System.out.println(sb.toString().contains("''"));
        String str=sb.toString().replaceFirst("'","");
        System.out.println(str);
        
    
    }
}
