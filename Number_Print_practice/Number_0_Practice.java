package number_printing_practice_23_10_2021;

public class Number_0_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_0_Practice sara=new Number_0_Practice();
		sara.number_0();

	}
public void number_0() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) { 
			if(row==1||row==7) { 
				System.out.print("  ");
				for(int col=1;col<=3;col++) { 
					System.out.print("*"+" ");
				}
			
			
			}
			else if(row==7) { 
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
  * * * 
*/
