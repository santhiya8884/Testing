package oct_9_10_2021;

public class Series_15_31_63_127_255 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series_15_31_63_127_255 sara=new Series_15_31_63_127_255();
		sara.prac_15_31_63_127_255();

	}

	public void prac_15_31_63_127_255() {
		// TODO Auto-generated method stub
		//15_31_63_127_255
		//15*2=30+1, 31*2=60+1,61*2=126+1, 127*2=244+1
		int n=15;
		while (n<=255) {
			System.out.print(n+" ");
			n=(n*2)+1;
		}
		/*System.out.print(n+" ");
		n=(n*2)+1;
		System.out.print(31+" ");
		n=(n*2)+1;
		System.out.print(63+" ");
		System.out.print(127+" ");
		System.out.print(255+" ");*/
		
		/*System.out.print(15+" ");
		System.out.print(31+" ");
		System.out.print(63+" ");
		System.out.print(127+" ");
		System.out.print(255+" ");*/

		
	}

}
//output:5_31_63_127_255 