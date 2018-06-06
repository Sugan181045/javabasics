package javabasics;

public class RevNumber {
	public static void main(String a[]) {
		
	
/* int i,j,num1=10,num=7;
 i=num/num1;
 j=num1%num;
 if(i==0)
 System.out.println(i);
 else
	System.out.println(j); ;
 */
int num=7631,temp=0;
 while(num!=0) {
	 temp=temp*10;
 temp=temp+(num%10);
 num=num/10;
 }
 System.out.println(temp);
 
}

}