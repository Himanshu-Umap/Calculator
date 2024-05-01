package input;

import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInput {
    Scanner sc = new Scanner(System.in);
    private double firstNumber;
    private double secondNumber;

    public UserInput() {
        try {
			System.out.print("Enter the first number: ");
			this.firstNumber = sc.nextDouble();
			System.out.print("Enter the second number: ");
			this.secondNumber = sc.nextDouble();
			
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Input! Enter the correct Intger Input.");
		}
    }

    public double getfirstNumber() {
        return firstNumber;
    }

    public double getsecondNumber() {
        return secondNumber;
    }
}

