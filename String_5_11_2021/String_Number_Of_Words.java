package string_5_11_2021;

import java.util.Scanner;

public class String_Number_Of_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Number_Of_Words sara=new String_Number_Of_Words();
		sara.numberOfWords();
	}

	public void numberOfWords() {
		// TODO Auto-generated method stub
		//String obj="Santhiya is very good girl";
		//String obj="";
		Scanner sc=new Scanner(System.in);
		String obj=sc.nextLine();
		int count=1;
		for(int i=0;i<obj.length();i++) { 
			if(obj.charAt(i)==' ') { 
				count++;
			}
		}
		System.out.println("NUmber of words in the given string "+count);
	}

}
/* output :
 Santhiya is a good girl
NUmber of words in the given string 5
*/ 
