package number_right_pattern_20_10_2021;

public class Number_Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Pattern33 sara=new Number_Pattern33();
		sara.loop2();
	}
	public void loop2() {
		// TODO Auto-generated method stub
		/*
		5 4 3 2 1
		4 3 2 1
		3 2 1
		2 1
		1 
		1 
		2 1
		3 2 1
		4 3 2 1
		5 4 3 2 1 */
		int row=5;
		for(;row>=1;row--) { 
			for(int col=row;col>=1;col--) {
				System.out.print(col+" ");
			}
			if(row>1) { 
				System.out.println();
			}
			
		}
		for(;row<=4;row++) { 
			for(int col=row;col>=1;col--) {
				System.out.print(col+" ");
			}
			System.out.println();

	}
}
}
/* output :
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1 
1 
2 1 
3 2 1 
4 3 2 1 
*/

