package com.org.logic;
import java.util.*;
public class PossibleWords {

	public  static String identifyPossibleWords(String input1,String input2) {
		input1=input1.toUpperCase();
		input2=input2.toUpperCase();
		String splitOne[]=input1.split("_");
		String split[]=input2.split(":");
		int lenOne=input1.length();
		int flag=0;
		String answer="";
		String result="";


        if(splitOne.length > 1){
        for(int i = 0; i < split.length ; i++){
          if((lenOne == split[i].length()) && (split[i].startsWith(splitOne[0])) && split[i].endsWith(splitOne[1])){
              result += split[i] + ":";
              flag = 1;
          }
          }
    }
        if(splitOne.length == 1){
        for(int i = 0; i < split.length ; i++){
          if((lenOne == split[i].length()) && (split[i].startsWith(splitOne[0])) || ( (lenOne == split[i].length()) && split[i].endsWith(splitOne[0]))){
              result += split[i] + ":";
              flag = 1;
          }
          }
    }
        if(flag == 1){
           answer = result.substring(0 , result.length()-1);
        }
        if(flag == 0){
            answer = "ERROR-009";
        }
        System.out.println(answer);
        return answer;
       
    

		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		identifyPossibleWords( input1, input2);
		
	}
}
