
package gettinginput;
import java.util.Scanner;
public class input {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your name");
		String name = scanner.nextLine();
		System.out.println("hello "+ name);
		System.out.println("what is your rating 1 to 5");
		int rating = scanner.nextInt();
		scanner.nextLine();
		System.out.println("you rated us "+ rating);
		System.out.println("what is your email");
		String email = scanner.nextLine();
		System.out.println("Your email id is "+ email);

		
		
	}

}
