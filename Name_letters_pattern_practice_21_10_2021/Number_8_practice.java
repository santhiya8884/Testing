package letters_pattern_practice_21_10_2021;

public class Number_8_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_8_practice sara=new Number_8_practice();
		sara.number_8_Pattern();

	}

	public void number_8_Pattern() {
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
* * * * * 
*       * 
*       * 
*       * 
*       * 
*       * 
* * * * * 

*/
