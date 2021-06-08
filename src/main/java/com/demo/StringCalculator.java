package com.demo;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {

	
	public static int sum(String input) {
		if(input.isEmpty())
			return 0;
		
		String delimiter = ",|\n";
		if(input.startsWith("//")) {
			String[] str = input.split("\n",2);
			delimiter = str[0].substring(2);
			input = str[1];
			
		}
			
			Stream<String> number = Arrays.stream(input.split(delimiter));
			return number.mapToInt(Integer::parseInt).sum();
		}
		
	}	
	

