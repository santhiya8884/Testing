package number_right_pattern_20_10_2021;

public class Number_Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Pattern22 sara=new Number_Pattern22();
		sara.loop3();
	}
	public void loop3() {
		// TODO Auto-generated method stub
		/*
		    1
		   1 1
		  1 2 1
		 1 3 3 1
		1 4 6 4 1  */
		int value=4;
		for(int row=1;row<=5;row++) {
			for(int k=value;k>=1;k--) { 
				System.out.print(" "+" ");
			}
			for(int col=1;col<=row;col++) { 
				System.out.print(col+"   ");
			}
			System.out.println();
			value--;
		} 
		
		
	}

}
