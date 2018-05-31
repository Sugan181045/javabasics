package javabasics;

public class ismultiple {
	public boolean ismultiple1(int one,int two) {
		return two%one==0?true:false;
	}
 public static void main(String a[]) {
	 ismultiple t1=new ismultiple();
	 System.out.println(t1.ismultiple1(2, 4));
 }
}
