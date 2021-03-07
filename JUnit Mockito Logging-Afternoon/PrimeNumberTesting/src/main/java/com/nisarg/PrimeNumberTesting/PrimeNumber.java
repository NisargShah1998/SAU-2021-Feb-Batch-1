package com.nisarg.PrimeNumberTesting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class PrimeNumberException extends Exception{
	public PrimeNumberException(String message) {
		super(message);
	}
}

public class PrimeNumber {
	static Logger log = LogManager.getLogger(PrimeNumber.class);
	CheckPrimeService service;
	
	//For Mockito 
	public PrimeNumber(CheckPrimeService service)
    {
        this.service = service;
    }
	
	//For Mockito 
	public boolean getPrimeStatusByNumber(int n) {
		boolean val = service.getPrimeStatus(n);
		return val;
	}
	
	//For JUnit Testing
	static boolean checkPrime(int num) {
		if(num==1) {
			return false; 
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			//For Logging
			log.debug(i +  " is " + (checkPrime(i)?" ":"not ") + "a prime number" );
			try {
				if(checkPrime(i)) {
					throw new PrimeNumberException("Prime Number: " + i );
				}
			}catch(PrimeNumberException e){
				System.out.println(e);
			}
		}
	} 
}
