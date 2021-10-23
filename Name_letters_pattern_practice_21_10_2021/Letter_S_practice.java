package letters_pattern_practice_21_10_2021;

public class Letter_S_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter_S_practice sara=new Letter_S_practice();
		sara.letter_S();
		System.out.println("\n");
		sara.letter_S1();


	}

	public void letter_S() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row==1||row==7) { 
				for(int col=1;col<=5;col++) {
					System.out.print("*"+" ");
				}
			}
			else {
				for(int col=1;col<=5;col++) { 
					if(col==1) {
						System.out.print("*"+" ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		for(int row=1;row<=7;row++) {
			if(row==7) { 
				for(int col=1;col<=5;col++) {
					System.out.print("*"+" ");
				}
			}
			else {
				for(int col=1;col<=5;col++) { 
					if(col==5) {
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

	public void letter_S1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row==1) { 
				System.out.print("  ");
				for(int col=1;col<=4;col++) {
					System.out.print("*"+" ");
				}
			}
			else if(row==7) {
				System.out.print("  ");
				for(int col=1;col<=3;col++) {
					System.out.print("*"+" ");
				}
			}
			else {
				for(int col=1;col<=5;col++) { 
					if(col==1) {
						System.out.print("*"+" ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		for(int row=1;row<=7;row++) {
			if(row==7) { 
				for(int col=1;col<=4;col++) {
					System.out.print("*"+" ");
				}
			}
			else {
				for(int col=1;col<=5;col++) { 
					if(col==5) {
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
* * * * * 
*         
*         
*         
*         
*         
* * * * * 
        * 
        * 
        * 
        * 
        * 
        * 
* * * * * 


  * * * * 
*         
*         
*         
*         
*         
  * * * 
        * 
        * 
        * 
        * 
        * 
        * 
* * * * 
*/
