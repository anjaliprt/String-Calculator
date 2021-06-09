package com.demo;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringCalculator {
	private String delimiter;
	private String numbers;

	
	public StringCalculator(String delimiter, String numbers) {
		super();
		this.delimiter = delimiter;
		this.numbers = numbers;
	}
	private int sum() {
		
		ensureNoNegativeNumbers();
		return getNumber().sum();
	}
	private void ensureNoNegativeNumbers() {
		String negativeNumberSequence = getNumber().filter(n -> n < 0)
				.mapToObj(Integer::toString)
				.collect(Collectors.joining(","));
		if (!negativeNumberSequence.isEmpty()) 
		{
			
		throw new RuntimeException("negative not allowed: " + negativeNumberSequence);
		}
	}
	private IntStream getNumber(){
		if(numbers.isEmpty())
			return IntStream.empty();
		else
		return Stream.of(numbers.split(delimiter))
				.mapToInt(Integer::parseInt);
				
		
	}

	public static int sum(String input) {
		if(input.isEmpty()) {
			return 0;
		}
		return parseInput(input).sum();
	}
		private static StringCalculator parseInput(String input) {
		
		if(input.startsWith("//")) {
			String[] str = input.split("\n",2);
			input = str[1];
			return new StringCalculator(str[0].substring(2),str[1]);
			}
		else
			return new StringCalculator(",|\n",input);

		}
		
	}	

		
	
	

