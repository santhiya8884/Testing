package number_right_pattern_20_10_2021;

public class Number_Pattern66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Pattern66 sara=new Number_Pattern66();
		sara.loop6();
	}
	public void loop6() {
		// TODO Auto-generated method stub
	/*	
		1 
		2 7
		3 8 13
		4 9 14 19
		5 10 15 20 25
		*/
		int value=1;
		for(int row=1;row<=5;row++) { 
			for(int col=row;col<=value;col+=5) { 
				System.out.print(col+" ");
			}
			System.out.println();
			value+=6;
		}
		
	}


}
/*
 * 1 
2 7 
3 8 13 
4 9 14 19 
5 10 15 20 25 
*/

