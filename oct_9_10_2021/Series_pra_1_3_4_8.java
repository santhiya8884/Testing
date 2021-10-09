package oct_9_10_2021;

public class Series_pra_1_3_4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1_3-4_8_15_27----Output
		//1+3+4=8, 3+4+8=15, 4+8+15=27
		
		Series_pra_1_3_4_8 sara=new Series_pra_1_3_4_8();
		sara.pra_1_3_4_8_15_27();
	}

	public void pra_1_3_4_8_15_27() {
		// TODO Auto-generated method stub
		int i=1,j=3,k=4,n,sum;
		System.out.print(1+" ");
		System.out.print(3+" ");
		System.out.print(4+" ");
		while (k<27) {
			sum=i+j+k;
			System.out.print(sum+" ");
			i=j;
			j=k;
			k=sum;
			//n=i+j+k;
		}
		/*n=i+j+k;
		System.out.print(n+" ");
		i=j;
		j=k;
		k=n;
		n=i+j+k;
		System.out.print(n+" ");
		i=j;
		j=k;
		k=n;
		n=i+j+k;
		System.out.print(n+" ");*/
		
		
		
		
		/*System.out.print(15+" ");
		System.out.print(27+" ");*/
		
	}
	

}

//output:1 3 4 8 15 27
