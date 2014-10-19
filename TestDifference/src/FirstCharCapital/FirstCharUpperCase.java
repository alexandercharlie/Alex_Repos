/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstCharCapital;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manjeet Singh
 */
public class FirstCharUpperCase {

    public static final String COPY_RIGHT = "Brought to you by: Alexander & Bros. Corp.";

    public static void main(String[] alex) {
        System.out.println(COPY_RIGHT.toUpperCase());
        Scanner in = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the Name of Country:".toUpperCase());
        String countryName = in.next();
        final StringBuilder result = new StringBuilder(countryName.length());
        String[] words = countryName.split("\\s");
        for (int x = 0, l = words.length; x < l; ++x) {
            if (x > 0) {
                result.append(" ");
            }
            result.append(Character.toUpperCase(words[x].charAt(0))).append(words[x].substring(1));
        }
        List<Country> countries = new ArrayList<Country>();
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) { 
            if (result.toString().equalsIgnoreCase(locale.getDisplayCountry())) {
                String iso = locale.getISO3Country();
                String code = locale.getCountry();
                String name = locale.getDisplayCountry();
                String language = locale.getDisplayLanguage();
                Currency currency=Currency.getInstance(new Locale("",code));
                if (!"".equals(iso) && !"".equals(code) && !"".equals(name)) {
                    countries.add(new Country(iso, code, name, language,currency));
                }
            }
            i++;
        }

        Collections.sort(countries, new CountryComparator());
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
