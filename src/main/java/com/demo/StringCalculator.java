package com.demo;

public class StringCalculator {

	
	public static int sum(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		else {
			return Integer.parseInt(input);
		}
	}
}
