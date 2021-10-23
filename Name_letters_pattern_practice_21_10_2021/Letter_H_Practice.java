package letters_pattern_practice_21_10_2021;

public class Letter_H_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter_H_Practice sara=new Letter_H_Practice();
		sara.letter_H();
		


	}

	public void letter_H() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row==4) { 
				//System.out.print("  ");
				for(int k=1;k<=5;k++) { 
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
	}

	
		
	

}
/* output :
*       * 
*       * 
*       * 
* * * * * 
*       * 
*       * 
*       * 
*/
