package oct_14_2021;

public class Num_Series_14_28_20_40_32_64_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num_Series_14_28_20_40_32_64_56 sara= new Num_Series_14_28_20_40_32_64_56();
		sara.Series();

	}

	public void Series() {
		// TODO Auto-generated method stub
		// 14 28 20 40 32 64 56
		int n=14,count=0;
		while (count<4) {
			System.out.print(n+" ");
			if (n==56) {
				break;
			}
			n=n*2;
			System.out.print(n+" ");
			n=n-8;
			count++;
		}
		/*System.out.println(n);
		n=n*2;
		System.out.println(n);
		n=n-8;
		System.out.println(n);
		n=n*2;
		System.out.println(n);
		n=n-8;
		System.out.println(n);
		n=n*2;
		System.out.println(n);
		n=n-8;
		System.out.println(n);
		n=n*2;
		System.out.println(n);
		n=n-8;
		*/
	}

}
