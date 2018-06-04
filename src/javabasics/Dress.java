package javabasics;

public class Dress {
 String color;
 double Price;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return Price;
}
public void setPrice(double price) {
	Price = price;
}
 public static void main(String a[]) {
	Dress one=new Dress();
	one.setColor("Blue");
	one.setPrice(2000);
	System.out.println(one.getColor());
	System.out.println(one.getPrice());;
	
 }
}
