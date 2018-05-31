package javabasics;

public class invoice {
	String partNumber;
	String partDiscription;
	int quantity;
	double price;
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDiscription() {
		return partDiscription;
	}
	public void setPartDiscription(String partDiscription) {
		this.partDiscription = partDiscription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0) {
			this.quantity=0;
		}
		else {
		this.quantity = quantity;
	}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0)
		{
			this.price=0.0;
		}
		else
		{
		this.price = price;
	}
		}
	public double getinvoiceamount() {
		return price*quantity;
	}
	public static void main(String a[]) {
		invoice inv1=new invoice();
		inv1.setQuantity(-10);
		inv1.setPrice(100);
		System.out.println(inv1.getinvoiceamount());
	}
	

}
