package oct_14_2021;

public class Num_Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num_Series1 sara=new Num_Series1();
		sara.Series();
	}

	public void Series() {
		// TODO Auto-generated method stub
		//5.2 4.8 4.4 4 3.6
		 float n=5.2f,count=0;
		 while (count<5) {
			 System.out.print(String.format("%.1f",n)+" ");
				n=n-0.4f;
				count++;
		}
		/*System.out.print(String.format("%.1f",n)+" ");
		n=n-0.4f;
		System.out.print(String.format("%.1f",n)+" ");
		n=n-0.4f;
		System.out.print(String.format("%.1f",n)+" ");
		n=n-0.4f;
		System.out.print(String.format("%.1f",n)+" ");
		n=n-0.4f;
		System.out.print(String.format("%.1f",n)+" ");
		n=n-0.4f;*/
		
	}

}
//output : 5.2 4.8 4.4 4.0 3.6 
