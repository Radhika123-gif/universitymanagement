package com.codegnan.exceptions;

class TooYoungException extends Exception{
	public TooYoungException(String message) {
		super(message);public class CustomisedException {
	}
}
class TooOldException extends Exception{
	public TooOldException(String message) {
		super(message);
	}
}
	
	
	
	
	
	
	
public class CustomisedException {
	public  void checkEligibility(int age)throws TooYoungException,TooOldException{
		if(age>18) {
			throw new TooYoungException("Marraige Cannot Approved: age is below 18 years");
		}else if(age>60) {
			throw new TooOldException("Your age is already crossed the marraige age...Marraige cannot Approved");
		}else{
			System.out.println("Marraige Approved! details will be processed Soon...... ");
		}
	}
		public static void main(String[] args) {
			CustomisedException checker=new CustomisedException();
			try{
				checker.checkEligibility(16);
			   }catch(TooYoungException e) {
					e.printStackTrace();
				}
			}

	}

}
