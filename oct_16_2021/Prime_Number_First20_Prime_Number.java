package oct_16_2021;

public class Prime_Number_First20_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prime_Number_First20_Prime_Number sara=new Prime_Number_First20_Prime_Number();
		sara.prime_Number();
	}

	public void prime_Number() {
		// TODO Auto-generated method stub
		//2_3_5_7_11_13_17_19_23_29
		int n=2,prime_count=0;               //2  3  4 5 6 7 
		//boolean prime=true;
		//System.out.print(2+" ");
		while (n>prime_count) { //3<100 4,
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
				prime_count++;
				System.out.println(prime_count+" prime number "+n+" ");
				if(prime_count==20) {
					break;
				}
			}
			n++;
		}
		
	}
	

}
/*output :
 * 1 prime number 2 
2 prime number 3 
3 prime number 5 
4 prime number 7 
5 prime number 11 
6 prime number 13 
7 prime number 17 
8 prime number 19 
9 prime number 23 
10 prime number 29 
11 prime number 31 
12 prime number 37 
13 prime number 41 
14 prime number 43 
15 prime number 47 
16 prime number 53 
17 prime number 59 
18 prime number 61 
19 prime number 67 
20 prime number 71 
*/

