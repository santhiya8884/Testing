package number_right_pattern_20_10_2021;

public class Number_Pat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Pat1 sara=new Number_Pat1();
		sara.loop1();
	}

	public void loop1() {
		// TODO Auto-generated method stub
	/*	1
		1 2
		1 2 3 
		1 2 3 4 
		1 2 3 4 5
	*/
		for(int row=1;row<=5;row++) { 
			for(int col=1;col<=row;col++) { 
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
/* 
 		1
		1 2
		1 2 3 
		1 2 3 4 
		1 2 3 4 5
 */
