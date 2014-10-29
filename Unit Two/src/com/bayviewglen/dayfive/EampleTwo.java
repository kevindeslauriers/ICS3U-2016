/*
 * Use if you want Locales - otherwise use one of the othe methods
 */
package com.bayviewglen.dayfive;

import java.text.NumberFormat;
import java.util.Locale;

public class EampleTwo {

	public static void main(String[] args) {
		NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
		double x = 23.4476545;
		
		System.out.println(moneyFormatter.format(x));
		
		
		Locale locale = Locale.GERMANY;
		moneyFormatter = NumberFormat.getCurrencyInstance(locale);
		System.out.println(moneyFormatter.format(x));
		
		locale = Locale.CANADA_FRENCH;
		moneyFormatter = NumberFormat.getCurrencyInstance(locale);
		System.out.println(moneyFormatter.format(x));
		
		moneyFormatter = NumberFormat.getPercentInstance();
		System.out.println(moneyFormatter.format(x));
		
/*****
$23.45
23,45 €
23,45 $
2,345%
*/
	}

}
