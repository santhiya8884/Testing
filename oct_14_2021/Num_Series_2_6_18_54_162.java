package oct_14_2021;

public class Num_Series_2_6_18_54_162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num_Series_2_6_18_54_162 sara=new Num_Series_2_6_18_54_162();
		sara.Series();
	}

	public void Series() {
		// TODO Auto-generated method stub
		//2 6 18 54 162
		int n=2,count=0;
		while (count<5) {
			System.out.print(n+" ");
			n=n*3;
			count++;
		}
		/*System.out.println(n);
		n=n*3;
		System.out.println(n);
		n=n*3;
		System.out.println(n);
		n=n*3;
		System.out.println(n);
		n=n*3;
		System.out.println(n);
		n=n*3;*/
	}

}
//output : 2 6 18 54 162 
