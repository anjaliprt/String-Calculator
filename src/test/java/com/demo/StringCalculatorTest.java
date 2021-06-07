package com.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	@Test
	void sumEmptyStringTo0() {
		assertEquals(0,StringCalculator.sum(""));
	}
}


