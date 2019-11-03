package ifs;

public class NumberVerify {
	
	//Method to check if number is even
	
	public String Even_Check(int num) {
		
		//Declare string 
		String answer = "";
		
		//Set answer to true if even
		if (num % 2 == 0) {
			answer = "true";
		}
		
		//Set answer to false if not even
		else if (num % 2 == 1) {
			answer = "false";
		}
		
	return answer;
	
	}
	
	//Method to check if number is odd
	
	public String Odd_Check(int num) {
		
		//Declare string
		String answer = "";
		
		//Set answer to false if not odd
		if (num % 2 == 0) {
			
			answer = "false";
		
		}
		
		//Set answer to true if odd
		else if (num % 2 == 1) {
			
			answer = "true";

		}
		
		return answer;
	}

}
