package array_25_10_2021;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str1=sc.nextLine();
		String str2="";
		/*for(int i=str1.length()-1;i>=0;i--) { 
			str2+=str1.charAt(i);
		}
		System.out.println(str2);*/
		char[] ch=str1.toCharArray();
		for(int i=ch.length-1;i>=0;i--) { 
			str2+=ch[i];
		}
		System.out.println(str1);
		System.out.println(str2);
		if(str1.equals(str2)) { 
			System.out.println("String are equals");
		}
		else { 
			System.out.println("String are  not equals");
		}
		/*if(str1==str2) { 
			System.out.println("String are equals");
		}
		else { 
			System.out.println("String are  not equals");
		}*/
	}

}
/* output :
 enter the string:
mam
mam
mam
String are equals
*/
 
	/* output :
	 *enter the string:
saas maam
saas maam
maam saas
String are  not equals
*/
