package oct_13;

public class Addition_Of_N_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition_Of_N_Numbers sara=new Addition_Of_N_Numbers();
		//sara.additon();
		sara.demo();

	}

	public void additon() {
		// TODO Auto-generated method stub
		//10 20 30 40 
		int n=10,tot=0,i=5;
		while (n<i) {
			tot=tot+n;
		//System.out.println(n+" "+tot);
		n=n+10;
		}
		//System.out.println(n);
		/*System.out.println(n);
		n=n+10;
		System.out.println(n);
		n=n+10;
		System.out.println(n);
		n=n+10;
		System.out.println(n);
		n=n+10;*/
		/*System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		System.out.println(40);*/
		
		
	}
	void demo() {
		int count = 5;
		while (count>=1) {
				int fact= 1;
				int no= 1;
					while(no<=count) {
						fact = fact*no;
						no++;
							}
					System.out.println(fact);
					count--;
					}
		
	
		
	
	} 

	

}
