
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
//import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manjeet Singh
 */
public class Atest {

    public static void main(String[] args) {
//String str="208#_2500#_kcal#_Calorie";
        //String nut[] = str.split("#_");
        //System.out.println("208".contains("{208}"));
        String capStr[] = null;
        List<String> rdaNumList = new ArrayList<String>();
        String listOF[] = {"2#_800#_45#_testqanew","203#_.85#_g#_Protein","204#_81.11#_g#_Totallipid(fat)","205#_.06#_g#_Carbohydrate","bydifference","208#_2500#_kcal#_Calorie","255#_15.87#_g#_Water","269#_.06#_g#_Sugars","total","291#_0#_g#_Fiber","totaldietary","301#_24#_mg#_Calcium","Ca","303#_.02#_mg#_Iron","Fe","304#_2#_mg#_Magnesium","Mg","305#_24#_mg#_Phosphorus","P","306#_24#_mg#_Potassium","K","307#_643#_mg#_Sodium","Na","309#_.09#_mg#_Zinc","Zn","606#_45#_g#_Fattyacids","totalsaturated"};
        for (int i = 0; i < listOF.length; i++) {
            rdaNumList.add(listOF[i].toString().trim());
        }
        String nutSelected[] ={"{208}"}; //{"2"," 203"," 204"," 205"," 208"," 255"," 269"," 291"," 301"," 303"," 304"," 305"," 306"," 307"," 309"," 606"};

        String selNut = Arrays.toString(nutSelected);

        capStr = new String[nutSelected.length];
        int cpCtr = 0;
        String p = "";
        for (String str : rdaNumList) {

            String nut[] = str.split("#_");
            if (nut != null && nut.length == 4) {
                if (selNut.contains(nut[0])) {
                    if (nutSelected.length == 1) {
                        if (!nutSelected[0].replaceAll("[{}]", "").equals(nut[0])) {
                            continue;
                        }
                        } 
                    //else if (nutSelected.length > 1) {
                            capStr[cpCtr] = nut[3];
                            cpCtr++;
                      //  }
                       


                    }
                }

            }
        for(int x=0;x<capStr.length;x++)
            System.out.println("" + capStr[x]);

        }


    }
