package array_23_10_2021;

import java.util.Scanner;

public class Vowels_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowels_Count sara=new Vowels_Count();
		sara.vowels_Count();
		
	}

	public void vowels_Count() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int count=0;
		/*for(int i=0;i<str.length();i++) { 
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				count++;
			}
		}
		System.out.println("totwl vowels count "+count);
	}*/
		for(int i=0;i<str.length();i++) { 
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println("totwl vowels count "+count);
	}

}
