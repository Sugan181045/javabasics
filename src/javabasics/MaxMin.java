package javabasics;

public class MaxMin {
	public static void main(String a[]) {
		
		
				int array[]= {3,4,5,2,33,24,2};
				int max=array[0];
				int min=array[0];
				for(int i=1;i<7;i++)
				{
					if (array[i]>max)
					{
						max=array[i];;
					}
					if(array[i]<max)
					{
						min=array[i];
					}
				}
				System.out.println("maxvalue : "+max);
				System.out.println("minvalue : "+min);
	}

}
