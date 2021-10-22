package letters_pattern_practice_21_10_2021;

public class P_Letter_praatice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P_Letter_praatice sara=new P_Letter_praatice();
		sara.letter_P_Practice();

	}
	int val=0;
	public void letter_P_Practice() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) { 
			if(row==1||row==7) { 
				for(int col=1;col<=5;col++) { 
					System.out.print("*"+" ");
				}
			}
			else {

				//int col=0;
				/*if(row==2||row==3||row==4||row==5||row==6)
					System.out.print("*");*/
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
		for(int row=1;row<=5;row++) { 
			System.out.println("*"+" ");
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
* 
* 
 
*/
