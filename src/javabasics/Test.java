package javabasics;

public class Test {
	public static void main(String a[]) {
		Travel travelone=new Dinosaur();
		Travel traveltwo=new Train();
		System.out.println(travelone instanceof Bike);
		System.out.println(travelone instanceof Dinosaur);
		System.out.println(traveltwo instanceof Train);
		Travel travelthree=new Monkey();
		Owner owner=(Monkey)travelthree;
		System.out.println(owner instanceof Monkey);
	}

}
