package letters_pattern_practice_21_10_2021;

public class Letter_I_Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter_I_Pratice sara=new Letter_I_Pratice();
		sara.letter_I();
		


	}

	public void letter_I() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row==1||row==7) {
				for(int col=1;col<=7;col++) { 
					System.out.print("*"+" " );
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
* * * * * * * 

*/
