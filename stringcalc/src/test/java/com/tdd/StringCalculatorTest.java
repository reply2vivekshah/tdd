package com.tdd;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

	@Test 
	public void testCalculateSum() {
		StringCalculator stringCalculator = new StringCalculator();
		assertTrue(0 == stringCalculator.calculateSum(null,","));
		assertTrue(0 == stringCalculator.calculateSum("",","));
		assertTrue(1 == stringCalculator.calculateSum("1",","));
		assertTrue(2 == stringCalculator.calculateSum("2",","));
		assertTrue(5 == stringCalculator.calculateSum("2,3",","));		
		assertTrue(72 == stringCalculator.calculateSum("2,3,67",","));
		assertTrue(38 == stringCalculator.calculateSum("2,3,33",","));
		assertTrue(6 == stringCalculator.calculateSum("2,3,1",","));		
		Assertions.assertThrows(NumberFormatException.class, () -> {
			stringCalculator.calculateSum("1,test",",");
		});		
	}
	
}
