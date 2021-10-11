package oct_11_10_2021;

public class Prime_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prime_Series sara=new Prime_Series();
		sara.prime_Number();
	}

	public void prime_Number() {
		// TODO Auto-generated method stub
		//2_3_5_7_11_13_17_19_23_29
		int n=3,i1=2,tot=100;
		//boolean prime=true;
		System.out.print(2+" ");
		while (n<tot) {
			int i=2;
			boolean prime=true;
			while (i<n) {
				if(n%i==0) { 
					//System.out.println("no prime");
					prime=false;
					break;
					
				}
				i++;
			}
			
			/*if(prime==false) { 
				System.out.println(n+" Not RIME NUMBER");
			}
			else {
				System.out.println(n+" PRIME NUMNBER");
			}*/
			if(prime==false) { 
				//System.out.println(n+" Not RIME NUMBER");
			}
			else {
				System.out.print(n+" ");
			}
			n++;
		}
		
	}
	

}
