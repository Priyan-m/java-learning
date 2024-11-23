package gettinginput;
import java.util.Scanner;
public class Switch {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a = scanner.nextInt();
		System.out.println("Enter the 2nd number");
		int b = scanner.nextInt();
		System.out.println("which operator do you want to use,+,-,*,/,%");
		char operator;
		operator = scanner.next().charAt(0);
		switch (operator) {
		case '+':
			System.out.println("a"+"+b"+"="+(a+b));
			break;
		case '-':
			System.out.println("a"+"-b"+"="+(a-b));
			break;
		case '*':
			System.out.println("a"+"*b"+"="+(a*b));
			break;
		case '/':
			System.out.println("a"+"/b"+"="+(a/b));
			break;
		case '%':
			System.out.println("a"+"%b"+"="+(a%b));
			break;
			default:
			System.out.println("the given operator is invalid");		}
		
	}

}
