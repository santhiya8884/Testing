package number_right_pattern_20_10_2021;

public class Number_Pa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Pa sara=new Number_Pa();
		sara.loop();

	}

	public void loop() {
		// TODO Auto-generated method stub
		/* 
		         5
		       4 5
		     3 4 5
		   2 3 4 5
		 1 2 3 4 5
		
		 */
		for(int row=5;row>=1;row--) { 
			for(int k=1;k<row;k++) {
				System.out.print(" "+" ");
			
			}
			for(int col=row;col<=5;col++) { 
				System.out.print(col+" ");
				
			}
			
			System.out.println();
		}
		
		
	}

}
/* 
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5

*/
