package letters_pattern_practice_21_10_2021;

public class Letter_A_Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter_A_Pratice sara=new Letter_A_Pratice();
		sara.letter_S();
		


	}

	public void letter_S() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row==1) { 
				System.out.print("  ");
				for(int col=1;col<=3;col++) {
					System.out.print("*"+" ");
				}
			}
			else if(row==7) {
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
			for(int col=1;col<=5;col++) { 
					if(col==1||col==5) {
						System.out.print("*"+" ");
					}
					else {
						System.out.print("  ");
					}
				}
			
			System.out.println();
		}
	}

	
		
	

}
/* output :
  * * * 
*       * 
*       * 
*       * 
*       * 
*       * 
* * * * * 
*       * 
*       * 
*       * 

*/
