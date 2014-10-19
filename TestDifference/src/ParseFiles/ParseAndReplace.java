/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ParseFiles;

import java.io.*;
import org.apache.commons.io.*; 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileFilter;
import java.io.OutputStream;
import java.net.URL;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Manjeet
 */
public class ParseAndReplace {

    public static void main(String[] args) {
//        Path path = Paths.get("test.txt");
//        Charset charset = StandardCharsets.UTF_8;
//
//        String content = new String(Files.readAllBytes(path), charset);
//        content = content.replaceAll("foo", "bar");
//        Files.write(path, content.getBytes(charset));
        //fileParser();
       fileParserUltimate();
    }
    private static void fileParser(){
     try { 
         String path="C:/Users/Manjeet/Desktop/PTR/T13034/Today/From sir/Exp/POCreate.jsp";
         
         File file = new File(path);
     String content = FileUtils.readFileToString(file, "UTF-8");
          content = content.replaceAll("11721", "14193");
     content = content.replaceAll("11980", "14195");

     FileUtils.writeStringToFile(file, content, "UTF-8");
  } catch (IOException e) {
     throw new RuntimeException("Generating file failed", e);
  }
    }
    
    private static void fileParserUltimate(){
    String filePath[]={"D:/USN/src/java/PPRO/Custom/APInvoiceChangeGLAcct.java","D:/USN/src/java/PPRO/Custom/BudgetAllocation.java","D:/USN/src/java/PPRO/Custom/InventoryRIMItem.java ","D:/USN/src/java/PPRO/Custom/InvMasterLIM.java ","D:/USN/src/java/PPRO/Custom/InvMasterOrderSheet.java ","D:/USN/src/java/PPRO/Custom/POChangeGLAcct.java ","D:/USN/src/java/PPRO/Custom/RFQHeaderHandler.java","D:/USN/web/AddGLAccount.jsp","D:/USN/web/BudgetAllocationForm.jsp","D:/USN/web/ChangeREQDept.jsp ","D:/USN/web/CompliancePODtlPopUp.jsp ","D:/USN/web/EditItemIpnOG.jsp ","D:/USN/web/EditItemOG.jsp ","D:/USN/web/HeaderPOUpdate.jsp ","D:/USN/web/HeaderPOUpdateApproval.jsp ","D:/USN/web/HeaderREQUpdate.jsp ","D:/USN/web/LimMultiLineUpdate.jsp ","D:/USN/web/OrderSheetMultiLineUpdate.jsp ","D:/USN/web/POCreate.jsp ","D:/USN/web/POCreateBckup111706.jsp ","D:/USN/web/PODtlPopUpApprover.jsp ","D:/USN/web/PODtlPopUpBuyer.jsp ","D:/USN/web/REQCreate.jsp ","D:/USN/web/REQDtlPopUpApprover.jsp ","D:/USN/web/REQDtlPopUpBuyer.jsp ","D:/USN/web/RFQDtlPopUp.jsp ","D:/USN/web/RimMultiLineUpdate.jsp ","D:/USN/web/RspTransfer.jsp ","D:/USN/web/RSP_ActiveDishSelFilter.jsp"};
    for(int i=0;i<filePath.length;i++){
         try { 
         String path=filePath[i].trim().toString();
         if(path.indexOf(".java")!=-1)
             continue;
             System.out.println(""+path);
         File file = new File(path);
     String content = FileUtils.readFileToString(file, "UTF-8");
     content = content.replaceAll("11721", "14193");
     content = content.replaceAll("11980", "14195");
     FileUtils.writeStringToFile(file, content, "UTF-8");
  } catch (IOException e) {
     throw new RuntimeException("Generating file failed", e);
  }
    }
    }
}
