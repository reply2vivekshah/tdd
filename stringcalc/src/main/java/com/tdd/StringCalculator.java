package com.tdd;

public class StringCalculator {

	public int calculateSum(String string, String delimeter) {
		int result = 0;
		if (string != null && !string.isEmpty()) {
			if (string.contains(delimeter)) {
				String[] stringArray = string.split(delimeter);
				for (String arrayElement : stringArray) {
					result = result + Integer.parseInt(arrayElement);
				}
			} else {
				result = Integer.parseInt(string);
			}
		}
		return result;
	}

}
