package Jumpstmts;

public class pattern {
	public static void main(String args[]) {
		int i,j;
		outerloop:
		for(i=1;i<=5;i++) {
			innerloop:
			for(j=1;j<=5;j++) {
				l1:
				if(i==2 && j==2) {
					break innerloop;
				}
				l2:
				if(i==3 && j==4) {
					break innerloop;
				}
				l3:
				if(i==4 && j==2) {
					break innerloop;
				}
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
