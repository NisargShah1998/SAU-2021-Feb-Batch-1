package com.nisarg.PrimeNumberTesting;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Test;

public class PrimeNumberMockitoTest {
	
	CheckPrimeService checkPrimeService = mock(CheckPrimeService.class);
	PrimeNumber primeNumber = new PrimeNumber(checkPrimeService);
	
	@Test
	public void testPrimeNumber() {		
		when(checkPrimeService.getPrimeStatus(19)).thenReturn(true);
		assertEquals(true,primeNumber.getPrimeStatusByNumber(19));
	}
}
