package number_printing_practice_23_10_2021;

public class Number_2_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_2_Practice sara=new Number_2_Practice();
		sara.number_2();

	}
public void number_2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) { 
			if(row==1||row==7) { 
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
		for(int row=1;row<=7;row++) { 
			if(row==7) { 
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
*/
