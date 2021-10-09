package oct_9_10_2021;

public class Series_2_3_6_18_108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series_2_3_6_18_108 sara=new Series_2_3_6_18_108();
		sara.prac_2_3_6_18_108();


	}
	public void prac_2_3_6_18_108() { 
		//2 3 6 18 108
		//2*3=6, 3*6=18,6*18=108
		int i=2,j=3;
		int n;
		System.out.print(i+" ");
		System.out.print(j+" ");
		
		while (j<108) {
			n=i*j;
			System.out.print(n+" ");
			i=j;
			j=n;
			
		}
		/*n=i*j;
		System.out.print(n+" ");
		i=j;
		j=n;
		
		System.out.print(n+" ");
		i=j;
		j=n;
		
		System.out.print(n+" ");*/
		
		//System.out.print(108+" ");
		
		/*System.out.print(2+" ");
		 System.out.print(23+" ");
		System.out.print(6+" ");
		System.out.print(18+" ");
		System.out.print(108+" ");*/
	}

}
//output : 2 3 6 18 108