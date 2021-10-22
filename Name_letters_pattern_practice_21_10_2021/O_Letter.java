package letters_pattern_practice_21_10_2021;

public class Letter4_Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter4_Practice4 sara=new Letter4_Practice4();
		//sara.letter_();
		sara.letter_O();
	}

	public void letter_O() {
		// TODO Auto-generated method stub
		/*
		* * * * * *
		* 		  *
		* 		  *
		* 	      *
		* 		  *
		* 		  *
		* * * * * *
		
		*/
		for(int row=1;row<=7;row++) { 
			if(row==1||row==7) {
				for(int col=1;col<=6;col++) { 
					System.out.print("*"+" ");
				}
			}
			else { 
				for(int col=1;col<=6;col++) { 
					if(col==1||col==6) {
						
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

	public void letter_() {
		// TODO Auto-generated method stub
		/*
		* * * * * *
		* * * * * *
		* * * * * *
		* * * * * *
		* * * * * *
		* * * * * *
		* * * * * *
		
		*/

		for(int row=1;row<=7;row++) { 
			for(int col=1;col<=5;col++) { 
				System.out.print("*"+" ");
			}
			System.out.println("*");
		}
		
	}

}
/* output :
  

* * * * * * 
*         * 
*         * 
*         * 
*         * 
*         * 
* * * * * * 

*/ 
