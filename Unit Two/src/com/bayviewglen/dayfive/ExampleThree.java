/*
 * Use if you do not need Locales but you need set defined widths - ie you are making a table
 * See document entitled Java_printf_method_quick_reference
 */
package com.bayviewglen.dayfive;

public class ExampleThree {

	public static void main(String[] args) {
		double number = 3.45677;
		int number2 = 3;
		
		// f is decimal #
		// d is integer
		// %width.decimalplacesTYPE
		// %10.2f means width of 10 and 2 decimal places for a decimal number
		
		System.out.printf("This is a string %10.2f %4d", number, number2);
	}

}
