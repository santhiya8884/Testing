package oct_14_2021;

public class Num_Series_8_6_9_23_87_429 {
	public static void main(String[] args) {
		Num_Series_8_6_9_23_87_429 sara=new Num_Series_8_6_9_23_87_429();
		sara.Series();
	}

	public  void Series() {
		// TODO Auto-generated method stub
		//8 6 9 23 87 429
		int n=8,i=1,k=2,count=0;
		System.out.print(n+" ");
		while (count<5) {
			n=n*i;//12
			n=n-k;//9
			System.out.print(n+" ");//9
			i++;
			k++;
			count++;
		}
		/*System.out.println(n);//8
		n=n*1;//8
		n=n-2;//6
		
		System.out.println(n);//6
		n=n*2;//12
		n=n-3;//9
		System.out.println(n);//9
		n=n*3;//27
		n=n-4;//23
		System.out.println(n);
		n=n*4;//12
		n=n-5;*/
		
		/*System.out.println(n);
		n=n*5;//12
		n=n-6;
		System.out.println(n);*/
		
	}

}
//output : 8 6 9 23 87 429 