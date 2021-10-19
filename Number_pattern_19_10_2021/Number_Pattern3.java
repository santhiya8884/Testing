package Number_pattern_19_10_2021;

public class Number_Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Pattern3 sara=new Number_Pattern3();
		sara.loop1();

	}

	public void loop1() {
		// TODO Auto-generated method stub
		/* 1 
		   2 3
		   3 4 5 
		   4 5 6 7 
		 */
		for(int row=1;row<=5;row++) {
			for(int col=0;col<row;col++) { 
				System.out.print((col+row)+" ");
			}
			System.out.println();
		}		
	} 

}
/*
 1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9 
*/
