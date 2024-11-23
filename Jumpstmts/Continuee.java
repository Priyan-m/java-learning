package Jumpstmts;

public class Continuee {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==3 && j==3)
						continue;
				System.out.print("*");
			}
			System.out.print("\n");
			//System.out.println("*");
		}
		
		// TODO Auto-generated method stub

	}

}
