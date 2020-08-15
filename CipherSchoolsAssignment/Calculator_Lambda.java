package CipherSchoolsAssignment;
import java.util.*;


public class Calculator_Lambda {
	@FunctionalInterface
	interface CalcOperation{
		int operation(int number1, int number2);
	}

	public int operate(int a,int b,CalcOperation op) {
		return op.operation(a,b);
	}
	
	private void addition(int a, int b) {
		CalcOperation add = (number1, number2) -> number1 + number2;
		System.out.println("Add = " + operate(a, b, add));
	}
	
	private void subtraction(int a, int b) {
		CalcOperation sub = (number1, number2) -> number1 - number2;
		System.out.println("Subtraction = " + operate(a, b, sub));
	}
	
	private void multiplication(int a, int b) {
		CalcOperation mul = (number1, number2) -> number1 * number2;
		System.out.println("Multiplication = " + operate(a, b, mul));
	}
	
	private void division(int a, int b) {
		CalcOperation div = (number1, number2) -> number1 / number2;
		System.out.println("Division = " + operate(a, b, div));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator_Lambda cl = new Calculator_Lambda();
		cl.addition(a, b);
		cl.subtraction(a, b);
		cl.multiplication(a, b);
		cl.division(a, b);
		

	}

}
