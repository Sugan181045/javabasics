package javabasics;

public class mystery1 {
	
	public static void main( String a[]  )
	{
	int row = 10;
	int column;

	while ( row >= 1 )
	 {
	 column = 1;

	 while ( column <= 10 )
	 {
	 System.out.print( row % 2 == 1 ? "<" : ">" );
	 ++column;
	 } // end while

	 --row;
	 System.out.println();
	 } // end while
	 } // end main
	 }



