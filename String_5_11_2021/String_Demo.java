package string_5_11_2021;

import java.util.Scanner;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=new String("Santhiya");
		System.out.println(s);
		System.out.println(s.hashCode());
		String s2="Santhiya";
		System.out.println(s2);
		System.out.println(s2.hashCode());
		String s3="sara";
		System.out.println(s3);
		System.out.println(s3.hashCode());
		s3="sarasanthiya";
		System.out.println(s3);
		System.out.println(s3.hashCode());
	}

}
/* ouput :
Santhiya
2072418941
Santhiya
2072418941
sara
3522813
sarasanthiya
1304668762
*/