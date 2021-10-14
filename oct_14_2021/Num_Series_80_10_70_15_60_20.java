package oct_14_2021;

public class Num_Series_80_10_70_15_60_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num_Series_80_10_70_15_60_20 sara=new Num_Series_80_10_70_15_60_20();
		sara.Series();
	}

	public void Series() {
		// TODO Auto-generated method stub
		//80 10 70 15 60 20
		int n=80,n1=10,count=0;
		while (count<3) {
			System.out.print(n+" ");
			System.out.print(n1+" ");
			n=n-10;
			n1=n1+5;
			count++;
		}
	/*	System.out.println(n);
		System.out.println(n1);
		n=n-10;
		n1=n1+5;
		System.out.println(n);
		System.out.println(n1);
		n=n-10;
		n1=n1+5;
		System.out.println(n);
		System.out.println(n1);
		n=n-10;
		n1=n1+5;*/
	}

}
//output : 80 10 70 15 60 20 
