package number_right_pattern_20_10_2021;

public class Number_Pattern55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Pattern55 sara=new Number_Pattern55();
		sara.loop5();
	}
	public void loop5() {
		// TODO Auto-generated method stub
		/*
		5 4 3 2 1
		5 4 3 2
		5 4 3
		5 4
		5
		*/
		
		for(int row=1;row<=5;row++) { 
			for(int col=5;col>=row;col--) { 
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

}
/* output :
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/
