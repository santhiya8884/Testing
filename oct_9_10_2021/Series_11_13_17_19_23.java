package oct_9_10_2021;

public class Series_11_13_17_19_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//11_13_17_19_23
		//11+2=13, 13+4=17, 17+2=19, 19+4=23
		Series_11_13_17_19_23 sara=new Series_11_13_17_19_23();
		sara.prac_11_13_17_19_23();
	}

	public void prac_11_13_17_19_23() {
		// TODO Auto-generated method stub
		int i=11;
		while (i<=23) {
			System.out.print(i+" ");
			i=i+2;
			if (i>23) {
				break;
			}
			System.out.print(i+" ");
			i=i+4;
		}
		/*System.out.print(i+" ");
		i=i+2;
		System.out.print(i+" ");
		i=i+4;
		System.out.print(i+" ");
		System.out.print(19+" ");
		System.out.print(23+" ");*/
		
		/*System.out.print(11+" ");
		System.out.print(13+" ");
		System.out.print(17+" ");
		System.out.print(19+" ");
		System.out.print(23+" ");*/
		
	}

}
//output:  11 13 17 19 23

