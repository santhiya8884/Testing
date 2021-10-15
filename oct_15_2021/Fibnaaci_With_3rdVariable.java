package oct_15_2021;

public class Fibnaaci_With_3rdVariable {

	public static void main(String[] args) {
		Fibnaaci_With_3rdVariable sara=new Fibnaaci_With_3rdVariable();
		sara.fib1();
		System.out.println();
		sara.fib2();

	}

	public void fib2() {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 8 13 21

				int first=-1,second=1,t=0; //////0====>f(1)+s(-1)===0
				
				while (t<21) {
					t=first+second;
					System.out.print(t+" ");
					first=second;
					second=t;
					//t=first+second;
					//System.out.println(t);
				}
		}

	public void fib1() {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 8 13 21

		int first=0,second=1,t=0; //////0====>f(1)+s(-1)===0
		System.out.print(first+" ");
		System.out.print(second+" ");
		while (t<21) {
			t=first+second;
			System.out.print(t+" ");
			first=second;
			second=t;
			//t=first+second;
			//System.out.println(t);
		}
		
	}

}
/* output :
 0 1 1 2 3 5 8 13 21 
0 1 1 2 3 5 8 13 21 
*/
