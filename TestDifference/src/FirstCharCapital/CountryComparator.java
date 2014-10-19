/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstCharCapital;

import java.text.Collator;
import java.util.Comparator;

/**
 *
 * @author Manjeet Singh
 */
class CountryComparator implements Comparator<Country> {
  private Comparator comparator;

  CountryComparator() {
    comparator = Collator.getInstance();
  }

    @Override
  public int compare(Country o1, Country o2) {
    return comparator.compare(o1.name, o2.name);
  }
}
