/**
 * Author: Brandon B.
 * Date: 9-14-15
 * Description: Takes two inputs and displays the quotient and remainder.
 */
 
import java.util.Scanner;
public class projectDivision {
    
    public static void main(String[] args) {
    	int firstNumber, secondNumber, largerNumber, smallerNumber, quotient, remainder;
    	Scanner kbReader = new Scanner(System.in);

		System.out.println("Pfeffer only wants the largest number/the smallest number. Watch out! :-(");
		System.out.print("Enter your first number: ");
		firstNumber = kbReader.nextInt();

		System.out.print("Enter your second number: ");
		secondNumber = kbReader.nextInt();

		largerNumber = Math.max(firstNumber, secondNumber);
		smallerNumber = Math.min(firstNumber, secondNumber);
		System.out.println("Dividing " + largerNumber + " by " + smallerNumber + "...");
		quotient = largerNumber / smallerNumber;
		remainder = largerNumber % smallerNumber;
		System.out.println("Results: " + quotient + " R" + remainder);
    }
}
