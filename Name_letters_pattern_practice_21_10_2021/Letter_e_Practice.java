package letters_pattern_practice_21_10_2021;

public class Letter_e_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter_e_Practice sara=new Letter_e_Practice();
		sara.letter_e();

	}

	public void letter_e() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row==1||row==7) { 
				for(int col=1;col<=5;col++) {
					System.out.print("*"+" ");
				}
			}
			else {
				for(int col=1;col<=5;col++) { 
					if(col==1||col==5) {
						System.out.print("*"+" ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		for(int row=1;row<=3;row++) {
			System.out.println("*");
		}
		for(int row=1;row<=5;row++) {
			System.out.print("*"+" ");
		}
	}

}

/* output :
 * * * * * 
*       * 
*       * 
*       * 
*       * 
*       * 
* * * * * 
*
*
*
* * * * * 

*/
