/**
 * Program: Temperature Converter Program
 * 
 * File: TemperatureConverter.java 
 * 
 * Summary: Takes a Fahrenheit temperature and converts it to Celsius, then it 
 * takes a Celsius temperature and converts it to Fahrenheit
 * 
 * Author: Corey Bernard
 * 
 * Date: June 1, 2017
 * 
 **/

//import the scanner utility to accept user input
import java.util.Scanner;

public class TemperatureConverter {
	//Start of main method
	public static void main(String[] args) {
		//Instantiate scanner
		Scanner input = new Scanner(System.in);
		
		//Ask for Fahrenhit temp and send data to fahrenheit converter
		System.out.println("Enter a Fahrenheit temperature:");
		int fahrenheit = input.nextInt();
		convertToCelsius(fahrenheit);
		
		//Ask for celsiusu temp and send data to celsius converter
		System.out.println("Enter a Celsius temperature:");
		int celsius = input.nextInt();
		convertToFahrenheit(celsius);
		
		//close scanner
		input.close();
	}
	
	//Converts fahrenheit to celsius then prints result to console
	public static void convertToCelsius(double fahrenheit){
		double celsiusTemp = (fahrenheit - 32) * 5 / 9;
		System.out.printf(fahrenheit + "F is equivelant to %.2fC\n", celsiusTemp);
	}
	
	//Converts celsius to fahrenheit then prints result to screen
	public static void convertToFahrenheit(double celsius){
		double fahrenheitTemp = celsius * 9 / 5 + 32;
		System.out.printf(celsius + "C is equivelant to %.2fF\n", fahrenheitTemp);
	}
	
}
