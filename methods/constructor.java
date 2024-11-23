package methods;
import java.util.Scanner;
class box{
	int length;
	int breadth;
	int height;

box(int l,int b ,int h){//constructor
	this.length =l;
	this.breadth=b;            //this pointer
	this.height=h;
}
 int volume(){
	return this.length*this.breadth*this.height;
}
}
//void setdim(int l,int b, int h){//
//	this.length =l;
//	this.breadth=b;            //this pointer
//	this.height=h;
//
// }

public class constructor {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
	box blackbox = new box(5,4,3);
	//blackbox.setdim(5,7,8);
	box whitebox = new box(2,2,2);
	System.out.println("blackbox volume is "+blackbox.volume() );
	System.out.println("whitebox volume is "+ whitebox.volume());

}
}



