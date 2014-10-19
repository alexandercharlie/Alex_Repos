/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstCharCapital;

import java.util.Currency;

/**
 *
 * @author Manjeet Singh
 */
class Country {
  private String iso;

  private String code;

  public String name;
  public String language;
   Currency currency;

  Country(String iso, String code, String name,String language,Currency currency) {
    this.iso = iso;
    this.code = code;
    this.name = name;
    this.language=language;
    this.currency=currency;
  }

  public String toString() {
    return iso + " - " + code + " - " + name.toUpperCase()+" - "+language.toUpperCase()+" - "+currency.getSymbol();
  }
}