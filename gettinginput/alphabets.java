package gettinginput;
import java.util.Scanner;
public class alphabets {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER THE WORD");
		String  alpha = scanner.nextLine();
		//System.out.println(alpha + " " + alpha.length() );
	    char ch = alpha.charAt(0);
		switch (ch) {
		case 'a':
			System.out.println(alpha +"is vowel");
			break;
		case 'e':
			System.out.println(alpha +"is vowel");
			break;
		case 'i':
			System.out.println(alpha +"is vowel");
			break;
		case 'o':
			System.out.println(alpha +"is vowel");
			break;
		case 'u':
			System.out.println(alpha +"is vowel");
			break;
		default:
				System.out.println(alpha +" is consonant");
		}
	}
}
		
		
		
		

