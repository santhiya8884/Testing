package oct_13;

public class Fact_Of_N_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fact_Of_N_Numbers sara=new Fact_Of_N_Numbers();
		sara.factorial();
	}

	public void factorial() {
		// TODO Auto-generated method stub
		int count=5;
		while (count>0) {
			int n=1,mul=1;
			while (n<=count) {
				mul=mul*n;
				//System.out.println(mul);
				n=n+1;
			}
			System.out.println(count +" factorial "+mul);
			count--;
		}
		
		
		/*while (n<=5) {
			mul=mul*n;
			//System.out.println(mul);
			n=n+1;
		}*/
		//System.out.println(mul);
		/*System.out.println(mul);
		mul=mul*n;
		n=n+1;
		System.out.println(mul);
		mul=mul*n;
		n=n+1;
		System.out.println(mul);
		mul=mul*n;
		n=n+1;
		System.out.println(mul);
		mul=mul*n;
		n=n+1;
		System.out.println(mul);
		mul=mul*n;
		n=n+1;
		System.out.println(mul);
		mul=mul*n;
		n=n+1;*/

		
		
	}

}
