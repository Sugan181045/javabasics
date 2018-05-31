package javabasics;

public class prfect {
	public static void main(String a[]) {
		prfect t1=new prfect();
		System.out.println(t1.isperfect(6));
	}
public boolean isperfect(int isperfect)
{
	int num=0;
	for (int i=1;i<=isperfect/2;i++)
	{
		if(isperfect%i==0) {
			num=num+i;
		}
	}
	if(num==isperfect)
	{
		return true;
	}
	else {
		return false;
	}
}
}
