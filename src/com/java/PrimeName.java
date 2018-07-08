package com.java;

public class PrimeName {
public static void main(String[] args) {
	String sentence="we Can do It ";
	String[] sc=sentence.split("\\s");
	int len1=sc.length;
	//System.out.println(len1);
	int count=0,no=0;
	for(String sent:sc) {
	//System.out.println(sent);
	int len=sent.length();
	//System.out.println(len);
	if(len==2) {
		count++;
	}
	if(len>2) {
		no=len%2;
		if(no!=0){
			count++;
		}else {
			count=count;
		}
	}
	}
	boolean s=Character.isUpperCase(sc[1].charAt(0));
	boolean s1=Character.isUpperCase(sc[3].charAt(0));
	if(s==true && s1==true) {
		count++;
	}else {
		count=count;
	}
	//System.out.println(count);
	if(count==(len1+1)){
		System.out.println("special");
	}else {
		System.out.println("notspecial");
	}
}
}


