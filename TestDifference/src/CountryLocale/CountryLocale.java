/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CountryLocale;

import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Manjeet Singh
 */
public class CountryLocale {
   public static void main(String[] args) throws InterruptedException {
    Map countriesISOCode = new HashMap();
    Map countryLanguage=new HashMap();
    for (String iso : Locale.getISOCountries()) {
        Locale l = new Locale("", iso);
        countriesISOCode.put(l.getDisplayCountry(), iso);
        countryLanguage.put(l.getDisplayCountry(), l);
    }
   
    
    Scanner in = new Scanner(System.in);
System.out.println("****** Brought to you by: Alexander & Bros. Corp. *******");
System.out.println("Enter the country name to get ISO Code:");
String countryName=in.next();
final StringBuilder result = new StringBuilder(countryName.length());
String[] words = countryName.split("\\s");
for(int i=0,l=words.length;i<l;++i) {
  if(i>0) result.append(" ");      
  result.append(Character.toUpperCase(words[i].charAt(0)))
        .append(words[i].substring(1));
}
System.out.println(countriesISOCode.get(result.toString().trim()));


//    System.out.println(countries.get("Switzerland"));
//    System.out.println(countries.get("Andorra"));
//    System.out.println(countries.get("Japan"));
}
}
