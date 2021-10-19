package Number_pattern_19_10_2021;

public class Number_Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Loop1 sara=new Number_Loop1();
		sara.loop();

	}

	private void loop() {
		// TODO Auto-generated method stub
		/* 
		 1 
		 4 7 
		 10 13 16 
	     19 22 25 28 
         31 34 37 40 43 
         */ 
		int value=1;
		for(int row=1;row<=5;row++) { 
			for(int col=1;col<=row;col++) { 
				System.out.print(value+" ");
				value=value+3;
			}
			System.out.println();
		}
	}

}
/* output :
1 
4 7 
10 13 16 
19 22 25 28 
31 34 37 40 43 
 */
 
 
