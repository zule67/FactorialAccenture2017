package org.accenture.factorial2;

public class Factorial {

	public long compute(long value) {
		long result ;
		if (value < 0) {
			throw new RuntimeException("The value is negative :" + value);
		}
		if ((value == 0) || (value == 1)) {
			result = 1;
		} else {
			return result = value * compute(value - 1);
		}
		return result;

	}
	public String toString() {
		int a = 5;
		long b = a+ 5;
		return "";
	}
}
