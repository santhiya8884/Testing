package number_right_pattern_20_10_2021;

public class Starr_Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Starr_Pattern2  sara=new Starr_Pattern2 ();
		sara.star2();
	}

	public void star2() {
		// TODO Auto-generated method stub
		/*
		* 
		* * 
		* * * 
		* * * * 
		* * * * * 
		 */
		for(int row=1;row<=5;row++) { 
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
