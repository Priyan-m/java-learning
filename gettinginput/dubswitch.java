package gettinginput;
import java.util.Scanner;
public class dubswitch {
	public static void main(String[] args) {
		Scanner scanner1 =  new Scanner(System.in);
		String choice; 
		do {
	        System.out.print("ENTER THE WORD: ");
	        String alpha = scanner1.nextLine();
	        char ch = alpha.charAt(0);

	        switch (ch) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(alpha + " is a vowel");
	                break;
	            default:
	                System.out.println(alpha + " is a consonant");
	        }
	      
	        System.out.println("do you wish to continue");
	        choice =  scanner1.nextLine();
			
		}while(choice.equals("yes"));
		  scanner1.close();	
	}
}
