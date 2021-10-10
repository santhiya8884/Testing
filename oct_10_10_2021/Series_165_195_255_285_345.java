package oct_10_10_2021;

public class Series_165_195_255_285_345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series_165_195_255_285_345 sara=new Series_165_195_255_285_345();
		sara.paract_165_195_255_285_345();
	}
	public void paract_165_195_255_285_345() { 
		//165 195 255 285 345
		//n=165, n=n+30, n=n+60, n=n+30
		int n=165;
		while (n<=345) {
			System.out.print(n+" ");
			n=n+30;
			if (n>345) {
				break;
			}
			System.out.print(n+" ");
			n=n+60;
		}
		/*System.out.println(n);
		n=n+30;
		System.out.println(n);
		n=n+60;
		System.out.println(255);
		System.out.println(285);
		System.out.println(345);*/
		
		/*System.out.println(165);
		System.out.println(195);
		System.out.println(255);
		System.out.println(285);
		System.out.println(345);*/
	}

}
