package oct_15_2021;

public class Prime_1_to_20_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prime_1_to_20_Numbers sara=new Prime_1_to_20_Numbers();
		sara.prime_Number();
	}

	public void prime_Number() {
		// TODO Auto-generated method stub
		//2_3_5_7_11_13_17_19_23_29
		int n=2,tot=20;              //2  3  4 5 6 7 
		//boolean prime=true;
		//System.out.print(2+" ");
		while (n<=tot) { //3<100 4,
			int i=2;
			boolean prime=true;
			while (i<n) {  
				if(n%i==0) { //3%2 15%2,3,45678911 12 13 14 10000
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
				
				System.out.println(" prime number "+n+" ");
				
			}
			n++;
		}
		
	}
	

}
/* output :
  prime number 2 
 prime number 3 
 prime number 5 
 prime number 7 
 prime number 11 
 prime number 13 
 prime number 17 
 prime number 19 
 */
