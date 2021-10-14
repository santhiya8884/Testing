package oct_14_2021;

public class Unary_Operator_2Operand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=50;
		System.out.println("Unary operator with 2operand");
		System.out.println(a++ + b--);
		System.out.println(++a + --a);
		System.out.println(++a + b--);
		System.out.println(a*2 + a--);
		System.out.println(a++ + a/5);

	}

}
/* output :
 * Unary operator with 2operand
60
23
61
36
13
*/
