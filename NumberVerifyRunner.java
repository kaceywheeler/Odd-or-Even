package ifs;
import java.util.Scanner;
import ifs.NumberVerify;

public class NumberVerifyRunner {
	public static void main (String args[] ) {
	
	//Create a new scanner
	Scanner keyboard = new Scanner(System.in);
	
	//Enter a whole number
	System.out.println("Enter a whole number: ");
	
	//Save number as num
	int num = keyboard.nextInt();
	
	//Create a new object
	NumberVerify ref = new NumberVerify();
	
	//Run Odd Check method on num
	String Odd_answer = ref.Odd_Check(num);
	
	//Say if answer is odd
	System.out.println(num + " is odd: " + Odd_answer);
	
	//Run Even Check method on num
	String Even_answer = ref.Even_Check(num);
	
	//Say if answer is even
	System.out.println(num + " is even: " + Even_answer);
	
	
	
	
	
	
	
	}
}
