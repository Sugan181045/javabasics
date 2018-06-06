package javabasics;

public class Fruits{
	
		public Fruits(){ 
			this(2);
	System.out.println("empty cons");
	}
		
		public  Fruits(int price){
			   this(2,"sweet");
				System.out.println("one arg cons");
			}
		
		
		public Fruits(int i,String taste){
			this(5,"sour","yellow");
			System.out.println("two arg cons");
			}
		
		
		
		public Fruits(int i,String taste,String color){
			
			System.out.println("three arg cons");
			}

		
			
		public static void main(String a[]) {
			Fruits one=new Fruits();
			
			
				
	}
		}

