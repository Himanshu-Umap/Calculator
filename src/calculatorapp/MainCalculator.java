package calculatorapp;

import java.util.Scanner;
import arithmetic.*;
import scientific.*;
import exceptions.*;
import input.SingleUserInput;
import input.UserInput;


public class MainCalculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	boolean cond = true;
    	System.out.println("							Welcome to Calculator");
		do {
			
			System.out.print("Enter the operator of the operation you want to perform (e.g., +, /, log, sqrt, pow, sin, etc..): ");
			String operator = sc.next().toLowerCase();
			Addition add = new Addition();
			Subtraction sub = new Subtraction();
			Multiplication mul = new Multiplication();
			Division div = new Division();
			Power pow = new Power();
			Logarithm log = new Logarithm();
			SquareRoot sqrt = new SquareRoot();
			Trigonometry trigo = new Trigonometry();
			
			
			if (operator.equals("+")) {
				UserInput userInput = new UserInput();
				double firstNumber = 0;
				double secondNumber = 0;
				firstNumber = userInput.getfirstNumber();
				secondNumber = userInput.getsecondNumber();
				final double result = add.add(firstNumber, secondNumber);
				System.out.println("Result: " + result);
				
			} else if (operator.equals("-")) {
				UserInput userInput = new UserInput();
				double firstNumber = userInput.getfirstNumber();
				double secondNumber = userInput.getsecondNumber();
				double result = sub.subtract(firstNumber, secondNumber);
				System.out.println("Result: " + result);
			} else if (operator.equals("*")) {
				UserInput userInput = new UserInput();
				double firstNumber = userInput.getfirstNumber();
				double secondNumber = userInput.getsecondNumber();
				double result = mul.multiply(firstNumber, secondNumber);
				System.out.println("Result: " + result);
			} else if (operator.equals("/")) {
				UserInput userInput = new UserInput();
				double firstNumber = userInput.getfirstNumber();
				double secondNumber = userInput.getsecondNumber();
				double result = 0;
				try {
					result = div.divide(firstNumber, secondNumber);
				} catch (DivisionByZeroException e) {
					System.out.println("Error! Division by zero is not allowed.");
				}
				System.out.println("Result: " + result);
			} else if (operator.equals("log")) {
				UserInput userInput = new UserInput();
				double firstNumber = userInput.getfirstNumber();
				double secondNumber = userInput.getsecondNumber();
				double result = log.log(firstNumber, secondNumber);
				System.out.println("Result: " + result);
			}
			else if (operator.equals("sin")) {
				SingleUserInput singleUserInput = new SingleUserInput();
				double Number1 = singleUserInput.getNumber1();
				double result = trigo.sin(Number1);
				System.out.println("Result: " + result);
			}
			
			else if (operator.equals("cos")) {
				SingleUserInput singleUserInput = new SingleUserInput();
				double Number1 = singleUserInput.getNumber1();
				double result = trigo.cos(Number1);
				System.out.println("Result: " + result);

			}else if (operator.equals("tan")) {
				SingleUserInput singleUserInput = new SingleUserInput();
				double Number1 = singleUserInput.getNumber1();
				double result = trigo.tan(Number1);
				System.out.println("Result: " + result);

			}else if (operator.equals("cot")) {
				SingleUserInput singleUserInput = new SingleUserInput();
				double Number1 = singleUserInput.getNumber1();
				double result = trigo.cot(Number1);
				System.out.println("Result: " + result);

			}else if (operator.equals("sec")) {
				SingleUserInput singleUserInput = new SingleUserInput();
				double Number1 = singleUserInput.getNumber1();
				double result = trigo.sec(Number1);
				System.out.println("Result: " + result);

			}else if (operator.equals("cosec")) {
				SingleUserInput singleUserInput = new SingleUserInput();
				double Number1 = singleUserInput.getNumber1();
				double result = trigo.cosec(Number1);
				System.out.println("Result: " + result);

			}else if (operator.equals("pow")) {
				UserInput userInput = new UserInput();
				double firstNumber = userInput.getfirstNumber();
				double secondNumber = userInput.getsecondNumber();
				double result = pow.pow(firstNumber, secondNumber);
				System.out.println("Result: " + result);
			} else if (operator.equals("sqrt")) {
				SingleUserInput singleUserInput = new SingleUserInput();
				double Number1 = singleUserInput.getNumber1();
				double result = sqrt.sqrt(Number1);
				System.out.println("Result: " + result);

			} else {
				System.out.println("Enter the correct operator and try again!!");
			} 
		System.out.print("Do you want to perform another calculation(true/false): ");
		cond = sc.nextBoolean();
		} while (cond);
		System.out.println("Thank You for using our Calculator.");
    }
}


