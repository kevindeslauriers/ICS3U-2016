package com.bayviewglen.dayseven;

public class ClassNotes {
	// The naming convention for constants is all UPPER_CASE_WITH_UNDERSCORES_TO_SEPERATE_WORDS
	
	// Why do we use constants?
	
	// Imagine a constant FRAMES_PER_SECOND = 30;
	
	// It is used it 423 places throughout 70 different files that make up your project.  
	
	// Imagine trying to change it from 30 to 45? It is easy with a constant and a nightmare without one.
	
	// We avoid having numbers in our code - these would be referred to as Magic Numbers 
	// Your assignments will give you marks for not using Magic Numbers. 
	
	int minutesPerYear = 365 * 24 * 60;	// uses 3 magic numbers 
	
	// The following line of code is a little confusing and the number 6 has no meaning to me - it actually returns a number between 1 and 6
	int side = (int)(Math.random() * 6) + 1;
	
	// This makes more sense and lets me know that the number 6 refers to the number of sides on a die
	side = (int)(Math.random() * SIDES_PER_DIE + 1);
}
