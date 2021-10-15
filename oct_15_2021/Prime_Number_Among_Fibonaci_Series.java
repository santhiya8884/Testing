package oct_15_2021;

public class Prime_Number_Among_Fibonaci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime_Number_Among_Fibonaci_Series sara=new Prime_Number_Among_Fibonaci_Series();
		sara.Fib1();
	}
	public void Fib1() {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 8 13 21
		int first=-1,second=1,i=1,t=0; 
		while (i<=20) { 
			t=first+second;
			//System.out.print((first+second)+" ");//34
			checkPrime(t) ;
			first=second;//0//34
			second=t;
			i++;
			//t=first+second;
			//System.out.println(t);
		}
		
	}
	public void checkPrime(int t) {
		// TODO Auto-generated method stub
		boolean prime=true;                     
		int i=2;
		if(t>=2) {  
			while (i<t) {			
				if (t%i==0) {
					prime=false;
					break;
				}
				
				i++;
			}
			if(prime==true) { 
				System.out.print(t+" ");
			}
		}
	
	}	
	
}
//output : 2 3 5 13 89 233 1597
