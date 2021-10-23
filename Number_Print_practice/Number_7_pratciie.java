package number_printing_practice_23_10_2021;

public class Number_7_pratciie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_7_pratciie sara=new Number_7_pratciie();
		sara.number_7();

	}
public void number_7() {
		// TODO Auto-generated method stub
	
		for(int row=1;row<=5;row++) { 
			if(row==1) { 
				for(int col=1;col<=5;col++) { 
					System.out.print("*"+" ");
				}
			}
				
			else if(row==2) { 
				for(int col=1;col<=4;col++) { 
					if(col==4) {
						System.out.print(" ");
					}
					else{
						System.out.print("  ");
					}
				}
				System.out.print("*");
				
			}
			else if(row==3) { 
				for(int col=1;col<=3;col++) { 
					if(col==3) {
						System.out.print(" ");
					}
					else{
						System.out.print("  ");
					}
				}
				System.out.print("*");
				
			}
			else if(row==4) { 
				for(int col=1;col<=2;col++) { 
					if(col==2) {
						System.out.print(" ");
					}
					else{
						System.out.print("  ");
					}
				}
				System.out.print("*");
				
			}
			else if(row==5) { 
				for(int col=1;col<=1;col++) { 
					if(col==1) {
						System.out.print(" ");
					}
					else{
						System.out.print("  ");
					}
				}
				System.out.print("*");
				
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

*/
