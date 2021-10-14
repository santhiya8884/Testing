package oct_14_2021;

public class Logical_OR_Bitwise_OR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=7;
		// || check the first is true not check the second
		// | checjk the both condtions
		// ||---t,f===t and f,t=t and f,f=f
		// | ----f,f=f
		System.out.println("Logical OR Bitwise OR");
		System.out.println(x>y||y>x);
		System.out.println(x>y|y>x);
		System.out.println(x-->--y|+-y>x);
		System.out.println(x>--y|y>++x);
		System.out.println(x<y|y>x);
	}

}
/* output :
 * Logical OR Bitwise OR
true
true
true
true
false
*/
