package letters_pattern_practice_21_10_2021;

public class Leter_Y_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leter_Y_Practice sara=new Leter_Y_Practice();
		sara.Y_Letter();
		

	}

	public void Y_Letter() {
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
			
		}
		System.out.println();
		
		}
		for(int row=1;row<=5;row++) { 
			for(int col=1;col<=5;col++){ 
				if(col==3) { 
					System.out.print("*");
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
  * * * 
    *    
    *    
    *    
    *    
    *    

*/
