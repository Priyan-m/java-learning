package gettinginput;
import java.util.Scanner;
public class arrayswithloops {
	public static void main(String args[]) {
		int a[] = new int[6];
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(i=0;i<a.length;i++)
			a[i]= scanner.nextInt();
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		
		
	}

}
