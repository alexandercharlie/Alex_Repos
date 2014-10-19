/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ParseFiles;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Manjeet
 */
public class ParseFIles {
private String panelArray[]={"11721","11980","12748","12222"};
    public static void main(String[] alex) {
        final File javaFolder = new File("D://USN//src//java");
        final File jspFolder = new File("D://USN//web");
        ParseFIles parser = new ParseFIles();
        System.out.println("============== JAVA FILES ==================");
        parser.listAllFilesInSrcFolder(javaFolder);
        System.out.println("============== JS & JSP FILES ==============");
        parser.listAllFIlesInWebFolder(jspFolder);//11721,11980,12748,12222
    }

    public void listAllFilesInSrcFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listAllFilesInSrcFolder(fileEntry);
            } else {
                if (fileEntry.getName().toString().indexOf(".java.") == -1) {
                    if (fileEntry.getName().indexOf(".java") != -1) {
                        try {
                            String content = FileUtils.readFileToString(fileEntry, "UTF-8");
                            if (content.toString().indexOf("12222") != -1)
//                                    || content.toString().indexOf("11980") != -1
//                                    || content.toString().indexOf("12748") != -1
//                                    || content.toString().indexOf("12222") != -1) 
                            {
                                System.out.println(fileEntry.getAbsolutePath());
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(ParseFIles.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }
    }

    public void listAllFIlesInWebFolder(File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listAllFIlesInWebFolder(fileEntry);
            } else {
                if (fileEntry.getName().toString().indexOf(".jsp.") == -1) {

                    if (fileEntry.getName().indexOf("-base") == -1 && fileEntry.getName().indexOf(".js") != -1) {

                        try {
                            String content = FileUtils.readFileToString(fileEntry, "UTF-8");
                            
                            if (content.toString().indexOf("12222") != -1)
//                                    || content.toString().indexOf("11980") != -1
//                                    || content.toString().indexOf("12748") != -1
//                                    || content.toString().indexOf("12222") != -1) 
                            {
                                if (fileEntry.getAbsolutePath().toString().indexOf("sencha") == -1) {
                                    System.out.println(fileEntry.getAbsolutePath());
                                }
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(ParseFIles.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                }
            }
        }
    }
}
