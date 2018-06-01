package javabasics;

public class Numbers {
	public static void main(String a[]) {
		int a1=9865;
		int t=a1;
		int arr[]= new int[10];
		int i=0;
		while(t>0)
			
		{
			int remainder=t%10;
			arr[i]=remainder;
			i++;
			t=t/10;
		}
		for(i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
	}

}
