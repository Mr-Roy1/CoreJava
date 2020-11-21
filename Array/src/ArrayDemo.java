
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]='A';
		
		System.out.println(arr[3]); 
		System.out.println(arr[4]);
		System.out.println(arr.length);
		int x=arr[3];
		System.err.println(x);
	}
}
