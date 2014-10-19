/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MISC_GetTheAvailaibleProcessor;

import java.util.Properties;

/**
 *
 * @author Manjeet Kumar
 */
public class GetCompleteSystemInfo {

    public static void main(String args[]) {
        //1.Get Java Runtime
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Runtime=" + Runtime.getRuntime());

        //2. Get Number of Processor availaible to JVM
        int numberOfProcessors = runtime.availableProcessors();
        System.out.println(numberOfProcessors + " Processors ");

        //2. Get FreeMemory, Max Memory and Total Memory
        long freeMemory = runtime.freeMemory();
        System.out.println("Bytes=" + freeMemory + " |KB=" + freeMemory / 1024 + " |MB=" + (freeMemory / 1024) / 1024+" Free Memory in JVM");

        long maxMemory = runtime.maxMemory();
        System.out.println(maxMemory + "-Bytes " + maxMemory / 1024 + "-KB  " + (maxMemory / 1024) / 1024 + "-MB " + " Max Memory Availaible in JVM");

        long totalMemory = runtime.totalMemory();
        System.out.println(totalMemory + "-Bytes " + totalMemory / 1024 + "-KB " + (totalMemory / 1024) / 1024 + "-MB " + " Total Memory Availaible in JVM");


        //3. Suggest JVM to Run Garbage Collector
        runtime.gc();

        //4. Suggest JVM to Run Discarded Object Finalization
        runtime.runFinalization();

        //5. Terminate JVM
        //System.out.println("About to halt the current jvm");//not to be run always
        //runtime.halt(1);
        // System.out.println("JVM Terminated");

        //6. Get OS Name
        String strOSName = System.getProperty("os.name");
        if (strOSName != null) {
            if (strOSName.toLowerCase().indexOf("windows") != -1) {
                System.out.println("This is "+strOSName);
            } else {
                System.out.print("Can't Determine");
            }
        }

        //7. Get JVM Spec
        String strJavaVersion = System.getProperty("java.specification.version");
        System.out.println("JVM Spec : " + strJavaVersion);
        //8. Get Class Path
        String strClassPath = System.getProperty("java.class.path");
        System.out.println("Classpath: " + strClassPath);

        //9. Get File Separator
        String strFileSeparator = System.getProperty("file.separator");
        System.out.println("File separator: " + strFileSeparator);

        //10. Get System Properties
        Properties prop = System.getProperties();
        System.out.println("System Properties(detail): " + prop);

        //11. Get System Time
        long lnSystemTime = System.currentTimeMillis();
        System.out.println("Milliseconds since midnight, January 1, 1970 UTC : " + lnSystemTime + "\nSecond=" + lnSystemTime / 1000 + "\nMinutes=" + (lnSystemTime / 1000) / 60 + ""
                + "\nHours=" + ((lnSystemTime / 1000) / 60) / 60 + "\nDays=" + (((lnSystemTime / 1000) / 60) / 60) / 24 + "\nYears=" + ((((lnSystemTime / 1000) / 60) / 60) / 24) / 365);
    }
}