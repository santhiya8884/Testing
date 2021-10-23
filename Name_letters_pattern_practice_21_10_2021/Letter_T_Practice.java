package letters_pattern_practice_21_10_2021;

public class Letter_T_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter_T_Practice sara=new Letter_T_Practice();
		sara.letter_T();
		


	}

	public void letter_T() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row==1) { 
				for(int col=1;col<=7;col++) { 
					System.out.print("*"+" ");
				}
			}
			else { 
				for(int col=1;col<=7;col++) { 
					if(col==4) { 
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
* * * * * * * 
      *       
      *       
      *       
      *       
      *       
      *   

*/
