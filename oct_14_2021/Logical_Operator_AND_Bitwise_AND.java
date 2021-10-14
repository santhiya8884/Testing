package oct_14_2021;

public class Logical_Operator_AND_Bitwise_AND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12,b=6;
		//logical AND-----First condition false no check for the second condition, result is false
		//Bitwise AND----- Whether First condition true or false  check for the second condition,
		System.out.println(x<b&&x>b);//logical AND
		System.out.println((x>b)&(x>b));//Bitwise AND
		System.out.println(x++>--b&&x<b);//logical AND
		System.out.println(b<x&x>b);//Bitwise AND
		System.out.println(2*x>b&&++x<--b);//logical AND
		System.out.println((b<x)&x>x);//Bitwise AND*/
		
		
		

	}

}
/* output: 
 * false
true
false
true
*/
