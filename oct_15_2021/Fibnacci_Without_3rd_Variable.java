package oct_15_2021;

public class Fibnacci_Without_3rd_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibnacci_Without_3rd_Variable sara= new Fibnacci_Without_3rd_Variable();
		sara.Fib1();

	}

	public void Fib1() {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 8 13 21
		int first=-1,second=1,i=1; //////0====>f(1)+s(-1)===0
		//System.out.print(first+" ");
		//System.out.print(second+" ");
		while (i<=10) { 
			
			System.out.print((first+second)+" ");//34
			second=first+second;//0//34
			first=second-first;
			i++;
			//t=first+second;
			//System.out.println(t);
		}
		
		
	}

}
