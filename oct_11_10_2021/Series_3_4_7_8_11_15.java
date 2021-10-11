package oct_11_10_2021;

public class Series_3_4_7_8_11_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series_3_4_7_8_11_15 sara=new Series_3_4_7_8_11_15();
		sara.pract_3_4_7_8_11_15();
	}
	public void pract_3_4_7_8_11_15() { 
		int n=3,n1=4;
		while (n<=15) {
			System.out.print(n+" ");
			if (n>=15) {
				break;
			}
			System.out.print(n1+" ");
			n=n+4;
			n1=n1+4;
		}
		/*System.out.print(n+" ");
		System.out.print(n1+" ");
		n=n+4;
		n1=n1+4;
		System.out.print(n+" ");
		System.out.print(n1+" ");
		n=n+4;
		n1=n1+4;
		System.out.print(n+" ");
		System.out.print(n1+" ");
		n=n+4;
		System.out.print(n+" ");
		System.out.print(n1+" ");
		n=n+4;
		n1=n1+4;
		
		/*System.out.print(3+" ");
		System.out.print(4+" ");
		System.out.print(7+" ");
		System.out.print(8+" ");
		System.out.print(11+" ");
		System.out.print(13+" ");
		System.out.print(15+" ");*/
	}
}
//output : 3 4 7 8 11 12 15 
