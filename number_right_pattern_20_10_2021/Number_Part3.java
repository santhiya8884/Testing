package number_right_pattern_20_10_2021;

public class Number_Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Part3 sara=new Number_Part3();
		sara.loop1();
	}
	public void loop1() {
		// TODO Auto-generated method stub
	/*
		1 2 3 4 5 
		1 2 3 4
		1 2 3
		1 2
		1 
		1
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5
	*/
		int row=5;
		for(;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			if(row>1) {
				System.out.println();
			}
		}
		for(;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}


}
/* output
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1 
1
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
*/
