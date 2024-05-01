package input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SingleUserInput {

    Scanner sc = new Scanner(System.in);
    private double Number1;

    public SingleUserInput() {
        try {
			System.out.print("Enter the angle in degrees: ");
			this.Number1 = sc.nextInt();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Input! Enter the correct Intger Input.");
		}
        
    }
    public double getNumber1() {
        return Number1;
    }
}
