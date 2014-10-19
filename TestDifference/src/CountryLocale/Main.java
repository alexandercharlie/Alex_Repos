import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;


public class Main {
  public static void main(String[] args) {
    List<Country> countries = new ArrayList<Country>();

    Locale[] locales = Locale.getAvailableLocales();
    for (Locale locale : locales) {
      String iso = locale.getISO3Country();
      String code = locale.getCountry();
      String name = locale.getDisplayCountry();

      if (!"".equals(iso) && !"".equals(code) && !"".equals(name)) {
        countries.add(new Country(iso, code, name));
      }
    }

    Collections.sort(countries, new CountryComparator());
    for (Country country : countries) {
      System.out.println(country);
    }
  }
}
class CountryComparator implements Comparator<Country> {
  private Comparator comparator;

  CountryComparator() {
    comparator = Collator.getInstance();
  }

  public int compare(Country o1, Country o2) {
    return comparator.compare(o1.name, o2.name);
  }
}

class Country {
  private String iso;

  private String code;

  public String name;

  Country(String iso, String code, String name) {
    this.iso = iso;
    this.code = code;
    this.name = name;
  }

  public String toString() {
    return iso + " - " + code + " - " + name.toUpperCase();
  }
}

   