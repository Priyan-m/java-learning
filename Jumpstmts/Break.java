package Jumpstmts;// labelled breaks


public class Break {
	public static void main(String args[]) {
	int i,j;
	outerloop: // labels
	for(i=1;i<=5;i++) {
		innerloop: // labels like goto stmt in other languages
		for(j=1;j<=5;j++) {
			if(i==3 && j==3)
					break outerloop;
			System.out.print("*");
		}
		System.out.print("\n");
		//System.out.println("*");
	}
	
	// TODO Auto-generated method stub

}

}


