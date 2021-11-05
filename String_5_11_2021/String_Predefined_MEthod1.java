package string_5_11_2021;

import java.util.Scanner;

public class String_Predefined_MEthod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Predefined_MEthod1 sara=new String_Predefined_MEthod1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		sara.indexOf(s);
		sara.lastIndexOf(s);
	}

	public void lastIndexOf(String s) {
		// TODO Auto-generated method stub
		System.out.println("lastIndexOf method :");
		System.out.println(s.lastIndexOf(0));
		System.out.println(s.lastIndexOf("a"));
	}

	public void indexOf(String s) {
		// TODO Auto-generated method stub
		System.out.println("indexOf method :");
		System.out.println(s.indexOf(0));
		System.out.println(s.indexOf("m"));
		
	}

}
/* output :
 Enter the String: 

indexOf method :
-1
-1
lastIndexOf method :
-1
-1


Enter the String: 
""
indexOf method :
-1
-1
lastIndexOf method :
-1
-1


Enter the String: 
"  "
indexOf method :
-1
-1
lastIndexOf method :
-1
-1

Enter the String: 
santhiya mom lachu
indexOf method :
-1
9
lastIndexOf method :
-1
14


*/
