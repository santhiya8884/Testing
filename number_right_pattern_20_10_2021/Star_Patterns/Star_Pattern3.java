package number_right_pattern_20_10_2021;

public class Star_Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star_Pattern3 sara=new Star_Pattern3();
		sara.star3();
	}

	public void star3() {
		// TODO Auto-generated method stub
		/*
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
		*/

		for(int row=5;row>=1;row--) { 
			for(int col=1;col<=row;col++) { 
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
/* output :
 * 
* * 
* * * 
* * * * 
* * * * * 
*/
