package number_printing_practice_23_10_2021;

public class NUmber_4_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NUmber_4_Practice sara=new NUmber_4_Practice();
		sara.number_4();

	}
public void number_4() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) { 
			if(row==7) { 
				for(int col=1;col<=7;col++) { 
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
		for(int row=1;row<=2;row++) { 
			for(int col=1;col<=5;col++) { 
				if(col==5) {
					System.out.print("*"+" ");
				}
				else { 
					System.out.print("  ");
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
*       * 
*       * 
*       * 
* * * * * * * 
        * 
        * 

*/
