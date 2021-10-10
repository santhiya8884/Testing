package oct_10_10_2021;

public class Series_3_7_16_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series_3_7_16_35 sara=new Series_3_7_16_35();
		sara.pract_3_7_16_35();
		

	}
	public void pract_3_7_16_35(){
		// 3 7 16 35
		//n=(n*2)+1, n=(n*2)+2, n=(n*2)+3,
		int n=3,i=1;
		while (n<=35) {
			System.out.print(n+" ");
			n=(n*2)+i;
			i++;
		}
		/*System.out.print(n+" ");
		n=(n*2)+i;
		i++;
		System.out.print(n+" ");
		n=(n*2)+i;
		i++;
		System.out.print(n+" ");
		n=(n*2)+i;
		i++;
		System.out.print(n+" ");
		n=(n*2)+i;
		i++;*/
		
		/*System.out.print(3+"");
		System.out.print(7+"");
		System.out.print(16+"");
		System.out.print(35+"");*/
	}

}
//output : 3 7 16 35 
