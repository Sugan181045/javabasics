package javabasics;
import java.util.*;
	public class WifiPin {
		public static void main(String a[]) {
			int temp,sum=0;
			Scanner sc=new Scanner(System.in);
			int roomNo1=sc.nextInt();
			String name=sc.nextLine();
		   int len=name.length();
			char Char = name.charAt(len-1);
			if((roomNo1>100)&&(roomNo1<999)) {
				int d= roomNo1;
            while (d != 0)
			        {
			            sum = sum +d % 10;
			            d= d/10;
			            }     
				roomNo1=roomNo1/10;
			    temp=roomNo1%10;
			    int c=roomNo1/10;
  
			   switch(c)
			   {
			   case 1:{
			    	String val="!";
			    	
			    	System.out.println(sum+" "+val+" "+Char+" "+temp);
			    	break;
			    }
			   
				
			 case  2: {
			    	String val1="@";
			    	System.out.println(sum+" "+val1+" "+Char+" "+temp);
			    	break;
			    }
			 case 3 :{
			    	String val2="#";
			    	System.out.println(sum+" "+val2+" "+Char+" "+temp);
			    	break;
			    }
			 case 4: {
			    	String val3="$";
			    	System.out.println(sum+" "+val3+" "+Char+" "+temp);
			    	break;
			    }
			 case 5: {
			    	String val4="%";
			    	System.out.println(sum+" "+val4+" "+Char+" "+temp);
			    	break;
			    }
			 case 6: {
			    	String val5="^";
			    	System.out.println(sum+" "+val5+" "+Char+" "+temp);
			    	break;
			    }
			 case 7: {
			    	String val6="&";
			    	System.out.println(sum+" "+val6+" "+Char+" "+temp);
			    	break;
			    }
			 case 8: {
			    	String val7="*";
			    	System.out.println(sum+" "+val7+" "+Char+" "+temp);
			    	break;
			    }
			 case 9: {
			    	String val8="(";
			    	System.out.println(sum+" "+val8+" "+Char+" "+temp);
			    	break;
			    }
			 case 0: {
			    	String val9=")";
			    	System.out.println(sum+" "+val9+" "+Char+" "+temp);
			    	break;
			    }
		
			   }
			}
			
			
			}
	}
		


