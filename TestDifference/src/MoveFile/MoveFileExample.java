/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MoveFile;

/**
 *
 * @author Manjeet Singh
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
 
public class MoveFileExample 
{
    public static void main(String[] args)
    {	
 
    	InputStream inStream = null;
	OutputStream outStream = null;
 
    	try{
            String sourceFile="C:\\folder1\\file1.txt";
            String file = sourceFile.substring(sourceFile.lastIndexOf('/')+1, sourceFile.lastIndexOf('.'));
            System.out.println(file);
    	    File afile =new File("C:\\folder1\\file1.txt");
    	    File bfile =new File("D:\\folder2\\file1.txt");
 
    	    inStream = new FileInputStream(afile);
    	    outStream = new FileOutputStream(bfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    //copy the file content in bytes 
    	    while ((length = inStream.read(buffer)) > 0){
 
    	    	outStream.write(buffer, 0, length);
 
    	    }
 
    	    inStream.close();
    	    outStream.close();
 
    	    //delete the original file
    	    //afile.delete();
 
    	    System.out.println("File is copied successful!");
 
    	}catch(IOException e){
    	    e.printStackTrace();
    	}
    }
}