package string_5_11_2021;

import java.util.Scanner;

public class String_Count_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Count_Sentence sara=new String_Count_Sentence();
		sara.countOfSentences();
	}

	public void countOfSentences() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) { 
			if(s.charAt(i)=='.') { 
				count++;
			}
		}
		System.out.println("Number of sentences "+count);
	}

}
/* output :
 Enter the Sentence
santhiya is a good girl. She's mom is very bold lady. And very Hardworker.
Number of sentences 3
*/
