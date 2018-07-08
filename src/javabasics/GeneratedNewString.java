package javabasics;

public class GeneratedNewString {
	public static void main(String[] args) {
		String name="tams";
		int len=name.length();
		char first=name.charAt(0);
		char up=Character.toUpperCase(first);
		char second=name.charAt(1);
		char up1=Character.toUpperCase(second);
		char third=name.charAt(len-2);
		char up2=Character.toUpperCase(third);
		char four=name.charAt(len-1);
		char up3=Character.toUpperCase(four);
		String output=up+""+up1+""+name+""+up2+""+up3;
		System.out.println(output);
		int length=output.length();
		System.out.println(length);
		if(length%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
}
