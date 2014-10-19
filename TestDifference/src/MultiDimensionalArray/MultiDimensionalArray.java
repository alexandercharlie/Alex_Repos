/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiDimensionalArray;

/**
 *
 * @author Manjeet Singh
 */
public class MultiDimensionalArray {
    public static void main(String[] man)
    {

String[][] sa1 = new String[4][5];
for( int i = 0; i < sa1.length; i++ ) {           // sa1.length == 4
  for ( int j = 0; j < sa1[i].length; j++ ) {     //sa1[i].length == 5
    sa1[i][j] = "new String value"+i+""+j;
  }
}
for(int x=0;x<sa1.length;x++){
for(int y=0;y<sa1[x].length;y++){    
System.out.println(sa1[x][y]);
}
}        
String[][] sa2 = new String[5][];
for( int i = 0; i < sa2.length; i++ ) {
 String[] anon = new String[]{"I'm", "a", "new", "array"};
  sa2[i] = anon;
}
for(int l=0;l<sa2.length;l++){
    for(int m=0;m<sa2[l].length;m++){
    System.out.println(sa2[l][m]);
    }
}
String[][] sa3 = new String[][]{ {"This","is","the", "First", "array"},{"This", "is", "Second"}};
for(int k=0;k<3;k++)
{
    for(int h=0;h<5;h++)
    {
    System.out.print(sa3[k][h]);
    }
}
    }
}
