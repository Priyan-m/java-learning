package methods;
// always use return in method most commonly used
public class methods {
	//method syntax- methods definiton
	   static int box(int length,int breadth,int height){//method head
		 int vol;                        //
		 vol= length*breadth*height;     //  method body                                 
		 return vol;                     //
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int volume = box(10,6,8);//to store the value that given by return stmt//passing arguments
		System.out.println("volume is   "+ volume );

	}

}
