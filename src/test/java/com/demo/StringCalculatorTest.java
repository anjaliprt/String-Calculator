package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void sumsEmptyStringTo0() {
		assertEquals(0,StringCalculator.sum(""));
	}
	@Test
	void sumsSingleNumberToItself() {
		assertEquals(3,StringCalculator.sum("3"));
		assertEquals(56,StringCalculator.sum("56"));
    }
	@Test
	void sumsTwoNumbersSeparatedByComma() {
		assertEquals(3,StringCalculator.sum("1,2"));
		assertEquals(4,StringCalculator.sum("1,3"));
	}
	@Test
	void sumsThreeNumbersSeparatedByComma() {
		assertEquals(6,StringCalculator.sum("1,2,3"));
	}
	@Test
	void sumsNumbersDelimittedByNewLine() {
		assertEquals(3,StringCalculator.sum("1\n2"));
	}
	@Test
	void sumNumbersDelimmitedByCommaOrNewLineOr() {
		assertEquals(6,StringCalculator.sum("1,2\n3"));
	}
	@Test
	void canAcceptDelimiterSpecified() {
		assertEquals(3,StringCalculator.sum("//;\n1;2"));
	}
	
	@Test
	void throwExceptionforNegativeNumbers() {
		try {
			StringCalculator.sum("-3");
			//fail ("Exception Expected");
		}
		catch(RuntimeException e) {
			
		}
		}
	@Test
	void exceptionMessageShouldContainTheNegativeNumber() {
		try {
			StringCalculator.sum("-1,-2,3");
			fail ("Exception Expected.");
		}
		catch(RuntimeException e) {
			assertEquals("negative not allowed: -1,-2",e.getMessage());
		}	
	}
}


