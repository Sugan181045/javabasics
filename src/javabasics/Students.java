package javabasics;

public class Students extends ClassRoom {
	public Students() {
		this(10);
		System.out.println("students are  absent");
	}
 public Students(int i) {
	 super();
	 System.out.println("students are persent");
 }
 public static void main(String a[]) {
	 Students name=new Students();
 }
}
