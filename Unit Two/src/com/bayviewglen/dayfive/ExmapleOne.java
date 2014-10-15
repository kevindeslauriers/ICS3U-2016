/* 
 * Use if you do not need Locales or defined set widths.
 */
package com.bayviewglen.dayfive;

import java.text.DecimalFormat;

public class ExmapleOne {

	public static void main(String[] args) {
		
		double x = 56.56;
		DecimalFormat formatter = new DecimalFormat("######.#");
		System.out.println(formatter.format(x));
		
		formatter = new DecimalFormat("######.000");
		System.out.println(formatter.format(x));
		
		formatter = new DecimalFormat("######.0%");
		System.out.println(formatter.format(x));
		
		x = 4544654.33;
		formatter = new DecimalFormat("###,###.000");
		System.out.println(formatter.format(x));
	}

}
