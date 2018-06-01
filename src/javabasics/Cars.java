package javabasics;

public class Cars {
	public Cars() {
		System.out.println("empty constructor called");
	}
	public Cars(int i) {
		System.out.println("one arg cons called");
	}
public static void main(String a[]) {
	Cars a1= new Cars(10);
}
}
