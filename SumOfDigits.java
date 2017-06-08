/**
 * Program: Sum Of Digits Program
 * 
 * File: SumOfDigits.java 
 * 
 * Summary: Takes a positive 5 digit number and displays the sum of its digits using only the / and % operators.
 * 
 * Author: Corey Bernard
 * 
 * Date: June 1, 2017
 * 
 **/

//import the scanner utility to accept user input
import java.util.Scanner;

public class SumOfDigits {
	//Main method starts
	public static void main(String[] args) {
		//Instantiate scanner
		Scanner input = new Scanner(System.in);
		//Ask user for input
		System.out.println("Enter a 5 digit positive number:");
		//Declare the user input as an int
		int userInput = input.nextInt();
		//Call the method with user input as a parameter
		calculateSum(userInput);
		//Close the scanner
		input.close();
	}
	
	//Method used to calculate the sum of the digits of the user input
	public static void calculateSum(int userInput) {
		//Instantiate variables
		int temp;
		int sum = 0;
		int[] digits = new int[5];
		
		//Create a loop to run 5 times, to get all 5 digits
		for (int i = 0; i < 5; i++) {
			temp = userInput % 10;
			digits[i] = temp;
			userInput = userInput / 10;
		}
		
		//Run through the array of digits and add them together
		for (int j : digits) {
			sum += j;
		}
		
		//Print the results to the console
		System.out.println("The sum of the digits is " + digits[4] + " + " + digits[3] + " + " + digits[2] + " + "
				+ digits[1] + " + " + digits[0] + " = " + sum);
	}
	
}



















