package javabasics;

public class shape {
	double length;
	double breadth;
	public shape(double length,double breadth) {
		if(length>0.0 && length<20.0 && breadth>0.0 && breadth<20.0)
			{
			this.length=length;
			this.breadth=breadth;
			}
		else {
			System.out.println("length and breadth should be between 0.0 to 20.0");
		}}
	public double findArea() {
		return length*breadth;
	}
	public double findPerimeter() {
		return (2*(length+breadth));
	}
public static void main(String a[]) {
	shape a1=new shape(2,3);
	System.out.println("Area = " +a1.findArea());
	System.out.println("Perimeter = "+a1.findPerimeter());
	
}
}
