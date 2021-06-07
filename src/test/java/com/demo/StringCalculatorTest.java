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
}


