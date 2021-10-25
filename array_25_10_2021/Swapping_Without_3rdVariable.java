
package array_25_10_2021;

import java.util.Scanner;

public class Swapping_Without_3rdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 2  values :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}

}
/* output :
enter the 2  values :
3 6
a is 6
b is 3

*/