package letters_pattern_practice_21_10_2021;

public class Letter3_Pratice3 {
	public static void main(String[] args) {
		Letter3_Pratice3  sara=new Letter3_Pratice3 ();
		sara.letter_F();
	}

	public void letter_F() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row==1) { 
				for(int col=1;col<=5;col++) { 
					System.out.print("*"+" ");
				}
			}
			if(row==4) { 
				for(int col=1;col<=3;col++) { 
					System.out.print("*"+" ");
				}
			}
			System.out.println("*");
		}
		
	}

}
/* output: 
* * * * * *
*
*
* * * *
*
*
*

*/