package array_23_10_2021;

public class Wrapper_Classes_Practices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=5;
		// b.
		Byte b1=5;
		System.out.println(b1.byteValue());
		System.out.println(b1.doubleValue());
		System.out.println(b1.equals(b));
		System.out.println(b);
		System.out.println(b1.hashCode());
		System.out.println(b1.intValue());
		System.out.println(b1.floatValue());
		System.out.println(b1.doubleValue());
		System.out.println(b1.toString());
		System.out.println(b1.longValue());
		System.out.println(b1.MAX_VALUE);
		System.out.println(b1.MIN_VALUE);
		System.out.println(Byte.MIN_VALUE);;
		System.out.println(Byte.MAX_VALUE);;;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		int a=5;
		Integer c=a;
		 System.out.println(c.hashCode());
		 
		/* Integer x=10;
		 Integer y=20;
		 System.out.println(a+b);*///--30
		 
		 Integer x=10;
		 Integer y=20;
		 System.out.println("x"+"y	");
		 
		 Integer x1=10;
		 Integer y1=20;
		 String s1=x1.toString();
		 String s2=y1.toString();
		 System.out.println(s1+s2);/// 1020
		 String s3="123";
		 //System.out.println(s3.valueOf(b));
		 System.out.println(s3+5);
		 int z=Integer.parseInt(s3);
		 System.out.println(z+5);
	}

}


/*
 *output :
 5
5.0
true
5
5
5
5.0
5.0
5
5
127
-128
-128
127
-2147483648
2147483647
5
xy	
1020
1235
128
*/
