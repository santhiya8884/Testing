package number_printing_practice_23_10_2021;

public class NUmber_3_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NUmber_3_Practice sara=new NUmber_3_Practice();
		sara.number_3();

	}

	public void number_3() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row==1) { 
				for(int col=1;col<=5;col++) { 
					System.out.print("*"+" ");
				}
			}
			else if(row==7) { 
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

}
/*  output :
 * * * * * 
        * 
        * 
        * 
        * 
        * 
* * * * 
        * 
        * 
        * 
        * 
        * 
        * 
* * * * *

*/
