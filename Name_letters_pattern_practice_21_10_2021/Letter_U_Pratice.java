package letters_pattern_practice_21_10_2021;

public class Letter_U_Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter_U_Pratice sara=new Letter_U_Pratice();
		sara.U_Letter();
		

	}

	public void U_Letter() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) { 
		if(row==7) { 
			System.out.print("  ");
			for(int col=1;col<=3;col++) { 
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
			/*int col=1;
			if(col==1) {
				System.out.print("*"+"   ");
			}
			col++;
			if(col==2) {
				System.out.print("  ");
			}
			col++;
			if(col==3) {
				System.out.print("  ");
			}
			col++;
			if(col==4) {
				System.out.print("  ");
			}
			col++;
			if(col==5) {
				System.out.print("*"+"  ");
			}*/
			
		/*	if(row==2||row==3|row==4||row==5||row==6) { 
				System.out.print("*"+"       *");
			}*/
		}
		System.out.println();
		}
	}

}
/* output :

*       * 
*       * 
*       * 
*       * 
*       * 
*       * 
  * * * 
*/
