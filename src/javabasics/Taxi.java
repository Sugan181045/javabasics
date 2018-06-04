package javabasics;

public class Taxi  extends Cars{
	public Taxi() {
		System.out.println("Taxi cons empty");
	}
    public Taxi(int speed) {
    	
    	
    	System.out.println("Taxi cons one arg");
    }
    public void brake() { 
        
    	System.out.println("brake in taxi called");
   }
    public static void main(String a[]) {
    	Taxi t1=new Taxi();
    	t1.brake();
    	
    }
}
