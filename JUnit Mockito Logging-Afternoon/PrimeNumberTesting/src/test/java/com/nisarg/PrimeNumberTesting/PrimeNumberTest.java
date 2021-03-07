package com.nisarg.PrimeNumberTesting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeNumberTest {
	@Test
	public void checkPrimeNumber() {
		boolean test1 = PrimeNumber.checkPrime(27);
		assertEquals(false,test1);
		
		boolean test2 = PrimeNumber.checkPrime(5);
		assertEquals(true,test2);
	}
}
