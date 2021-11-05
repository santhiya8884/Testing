package string_5_11_2021;

import java.util.Scanner;

public class String_Predefined_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Predefined_Methods sara=new String_Predefined_Methods();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		sara.contaisMethod(s);
		sara.startsWith(s);
		sara.endsWith(s);
		
	}

	public void endsWith(String s) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		System.out.println("ends with  Method: ");
		/*
		 * System.out.println("Enter the String :"); 
		 * String s=sc.nextLine();
		 */
		System.out.println(s.endsWith("a"));
		System.out.println(s.endsWith("z"));
		System.out.println(s.endsWith(" "));
	}

	public void startsWith(String s) {
		// TODO Auto-generated method stub
		///Scanner sc=new Scanner(System.in);
		System.out.println("Starts with  Method: ");
		/*
		 * System.out.println("Enter the String :"); 
		 * String s=sc.nextLine();
		 */		System.out.println(s.startsWith("san"));
		System.out.println(s.startsWith("x"));
	}

	public void contaisMethod(String s) {
		// TODO Auto-generated method stub
	//	Scanner sc=new Scanner(System.in);
		System.out.println("Conatis Method: ");
		/*
		 * System.out.println("Enter the String :"); 
		 * String s=sc.nextLine();
		 */
		//contains
		System.out.println(s.contains("z"));
		System.out.println(s.contains("san"));
	}

}
/* output : Conatis Method:
 Enter the String :
santhiya
false
true
*/
/* output : startsWith
 Starts with  Method: 
Enter the String :

false
false
*/
/* output : endsWith
 * ends with  Method: 
Enter the String :
sara
true
false


Final output: 

Enter the String: 
santhiya
Conatis Method: 
false
true
Starts with  Method: 
true
false
ends with  Method: 
true
false
false

*/
