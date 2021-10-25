package array_25_10_2021;

import java.util.Scanner;

public class Swapping_Of_3rd_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2 numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}

}
/* output :
enter the 2 numbers :
34 78
a is 78
b is 34
*/