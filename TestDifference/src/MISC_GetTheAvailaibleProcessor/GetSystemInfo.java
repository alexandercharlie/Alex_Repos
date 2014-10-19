/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MISC_GetTheAvailaibleProcessor;

/**
 *
 * @author Manjeet Singh
 */
import java.io.*;
import java.lang.management.ManagementFactory;
public class GetSystemInfo {
    public static void main(String[] args){
    long diskSize = new File("/").getTotalSpace();
    String userName = System.getProperty("user.name");
    long maxMemory = Runtime.getRuntime().maxMemory();
    long memorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory
        .getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
    
    System.out.println("diskSize= "+diskSize+"\n userName= "+userName+"\n maxMemory= "+maxMemory+"\n memorySize= "+memorySize+"\n");
    }
}
