package gettinginput;
import java.util.Scanner;
public class Grade {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks");
		int num;
		num = scanner.nextInt();
		if (num>0) {
			if(num<100 && num>=90) {
			System.out.println("Grade A");}
			else if(num<90 && num>=80) {
			System.out.println("Grade B");}
			else if(num<80 && num>=70) {
		    System.out.println("Grade C");}
			else if(num<70 && num>=60) {
	        System.out.println("Grade D");}
			else if(num<60 && num>=50) {
		    System.out.println("Grade E");}
		else {
			System.out.println("FAIL");
		}
		}
	}
}

		


