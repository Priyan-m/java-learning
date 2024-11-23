class box{
		int length,breadth,height;
	}
	int volume{
		return length*breadth*height;
	}
	public class invokingmethods {
		box blackbox= new box(System.in);
		blackbox.length=10;
		blackbox.breadth=4;
		blackbox.height=9;
		System.out.println("blackboxvolume is"+blackbox.volume()); //invoking methods using objects to invoke a metyhod
		
		
	

}
