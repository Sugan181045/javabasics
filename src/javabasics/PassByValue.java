package javabasics;

public class PassByValue {
	
	public static void main(String a[]) {
		one obj= new one();
		int d=obj.c(5,2);
		System.out.println(d);
	}
	
}
	
	
	
	class one{
		public  int c(int a,int b) {
			int c=a*b;
			return c;
		
	}

}
