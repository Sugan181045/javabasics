package javabasics;

public class Flowers extends Fruits{
	public Flowers() {
	System.out.println("Empty ");
}
	public Flowers(int price) {
		this();
		System.out.println("twenty rupees ");
	}
public static void main(String a[]) {
	Flowers one=new Flowers(10);
}
}
