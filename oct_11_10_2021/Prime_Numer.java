package oct_11_10_2021;

public class Prime_Numer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prime_Numer sara=new Prime_Numer();
		sara.prime_Number();
	}

	public void prime_Number() {
		// TODO Auto-generated method stub
		//2_3_5_7_11_13_17_19_23_29
		int n=237,i=2;
		boolean prime=true;
		//System.out.print(2+" ");
		while (i<n) {
			if(n%i==0) { 
				//System.out.println("no prime");
				prime=false;
				break;
				
			}
			
			
			/*else { 
				System.out.println("prime");
			}*/
			/*if((n%i)!=0) { 
			System.out.println("prime");
			}*/
			i++;
		}
		
		if(prime==false) { 
			System.out.println(n+" Not RIME NUMBER");
		}
		else {
			System.out.println(n+" PRIME NUMNBER");
		}
		
		
		
			
		
		
			
		
		/*System.out.print(2+" ");
		System.out.print(3+" ");
		System.out.print(7+" ");
		System.out.print(11+" ");
		System.out.print(13+" ");
		System.out.print(17+" ");
		System.out.print(19+" ");
		System.out.print(23+" ");
		System.out.print(29+" ");*/
		
		
		
		
		
	}
	

}
