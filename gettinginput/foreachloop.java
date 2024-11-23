package gettinginput;

public class foreachloop {
	public static void main(String[] arg) {
		int sum=0;
		int i=0;
		int arr[]= {1,4,6,7,8};
		int n = arr.length;
		for (i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(int x:arr) {
			sum= sum+x;
		}
		System.out.println("sum is "+ sum);
		
		
	}

}
