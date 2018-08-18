package com.org.logic;

import java.util.Scanner;

public class CyclicCode {
 public static void main(String args[]) {
	Scanner sc=new Scanner(System.in); 
	int input1=sc.nextInt();
	int sum=0;
	String temp=""+input1;
	System.out.println("temp"+temp.length());
	int arr[]=new int[temp.length()];
	int i=temp.length()-1;
	while(i>=0){
		arr[i]=input1%10;
		input1/=10;
		i--;
	}
	System.out.println("arr"+arr.length);
	for(i=0;i<arr.length;i++){
		sum+=arr[i];
	}
	System.out.println("1sum"+sum);
	int j=0;
	int sumOne=0;
	while(j!= arr.length){
		for(i=0;i<arr.length;i++){
			sumOne+=arr[i];
		}
		System.out.println("1sumone"+sumOne);
		sum+=sumOne-arr[j];
		System.out.println(sum+"{");
		arr[j]=0;
		sumOne=0;
		j++;
	}
	System.out.println(sum);
}
}
