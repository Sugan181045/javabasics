package com.java;

public class UniqueDigitCount {
	public static void main(String[] args) {
		int num=12345656;
		int c=0,r;
		int arr[]=new int[10];
		while(num!=0) {
			r=num%10;
			arr[r]=1;
			num=num/10;
		}
		for(int i=0;i<10;i++) {
			c=c+arr[i];
		}
		System.out.println(c);
	}

}
