package com.demo;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringCalculator {

	
	public static int sum(String input) {
		if(input.isEmpty())
			return 0;
			
			Stream<String> number = Arrays.stream(input.split(",|\n"));
			return number.mapToInt(Integer::parseInt).sum();
		}
		
	}	
	

