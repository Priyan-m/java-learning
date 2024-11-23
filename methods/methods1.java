package methods;

public class methods1 {
	 static void box(int length,int breadth,int height) {// using void because we are not returning anything as we are directly using print stmt instead of return
		   
		int vol;
		vol=length*breadth*height;
		System.out.println("volume is " + vol);
	}
	public static void main(String args[]) {
		box(10,4,6);
	}

}
