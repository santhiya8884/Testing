package number_right_pattern_20_10_2021;

public class Star_Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star_Pattern1 sara=new Star_Pattern1();
		sara.star1();
	}

	public void star1() {
		// TODO Auto-generated method stub
		/*
		* * * * * 
		* * * * * 
		* * * * * 
		* * * * * 
		* * * * * 
		*/
		for(int row=1;row<=5;row++) { 
			for(int col=1;col<=5;col++) { 
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
/*output :
 * * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
*/
