package oct_14_2021;

public class Unary_Operator_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unary_Operator_Example sara=new Unary_Operator_Example();
		sara.examMethod1();
		sara.examMethod2();
	}

	public
	void examMethod2() {
		// TODO Auto-generated method stub
		//Using 2 operands
		System.out.println("Using 2 operands");
		int a=10,b=20;
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a++ + ++a);
		System.out.println(a-- + --a);
		System.out.println(b++ + ++b);
		System.out.println(b-- + --b);
		System.out.println(a);
		System.out.println(b);
	}

	public  void examMethod1() {
		// TODO Auto-generated method stub
		//Using one Operand
		System.out.println("Using one Operand");
		int x=10;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
	}

}

//output :
/*Using one Operand
10
12
12
10
Using 2 operands
10
8
8
10
22
22
42
42
10
20
*/

