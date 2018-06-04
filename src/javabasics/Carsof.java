package javabasics;

public class Carsof {
	String model;
	double speed;
	
	public void accelerate() {
		speed=10;
	}
public static void main(String a[]) {
	car car1=new car();
	car car2=new car();
   car1.speed=20.0;
   car2.speed=30.0;
	System.out.println(car1.speed);
	System.out.println(car2.speed);;
}
}
