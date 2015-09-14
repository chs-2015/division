/**
 * Author: Brandon B.
 * Date: 9-14-15
 * Description: Takes two inputs and displays the quotient and remainder.
 */
 
import java.util.Scanner;
public class projectDivision {
    public static void main(String[] args) {
    	// Initialize our variables. (they're very self-explanatory)
    	int firstNumber, secondNumber, largerNumber, smallerNumber, quotient, remainder;
    	Scanner kbReader = new Scanner(System.in);

		// Warn & query the user
		System.out.println("Pfeffer only wants the largest number divided by the smallest number. Watch out! :-(");
		System.out.print("Enter your first number: ");
		firstNumber = kbReader.nextInt();

		System.out.print("Enter your second number: ");
		secondNumber = kbReader.nextInt();

		// Determine the largest and smallest number
		largerNumber = Math.max(firstNumber, secondNumber);
		smallerNumber = Math.min(firstNumber, secondNumber);

		// Do some math
		System.out.println("Dividing " + largerNumber + " by " + smallerNumber + "...");
		quotient = largerNumber / smallerNumber;
		remainder = largerNumber % smallerNumber;

		// Return results to the user
		System.out.println("Results: " + quotient + " R" + remainder);
    }
}