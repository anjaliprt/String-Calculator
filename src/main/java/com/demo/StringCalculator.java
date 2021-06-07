package com.demo;

public class StringCalculator {

	
	public static int sum(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		else if(input.contains(",")) {
			String [] number = input.split(",");
			return Integer.parseInt(number[0])+ Integer.parseInt(number[1]);
		}
		else {
			return Integer.parseInt(input);
		}
	}
}
