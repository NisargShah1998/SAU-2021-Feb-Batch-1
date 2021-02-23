class PrimeNumberException extends Exception{
	public PrimeNumberException(String message) {
		super(message);
	}
}

public class CustomException {
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
