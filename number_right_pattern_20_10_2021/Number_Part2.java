package number_right_pattern_20_10_2021;

public class Number_Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Part2 sara=new Number_Part2();
		sara.loop();
		//sara.loop1();
		//sara.loop2();
		//sara.loop3();
		//sara.loop4();
		//sara.loop5();
		//sara.loop6();
		//sara.alphabet1();
	}

	public void alphabet1() {
		// TODO Auto-generated method stub
		int value=65;
		for(int row=1;row<=5;row++) { 
			for(int col=0;col<row;col++) { 
				//System.out.print((char)(value)+" ");
				System.out.print((char)(value+col)+" ");
			}
			System.out.println();
			
		}
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

	public void loop4() {
		// TODO Auto-generated method stub
	/*
		1
		2 3
		4 5 6
		7 8 9 10
		11 12 13 14 15 */
		int value=1;
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) { 
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
			
		}
	
		
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
		for(;row<=5;row++) { 
			for(int col=row;col>=1;col--) {
				System.out.print(col+" ");
			}
			System.out.println();
			
		}
		
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

	public void loop() {
		// TODO Auto-generated method stub
	/*
		
		1  
		1 2 
		1 2 3 
		1 2 3 4  
		1 2 3 4 5 
		1 2 3 4 
		1 2 3
		1 2
		1
	*/	
		/*for(int row=1;row<=9;row++) { 
			for(int col=1;col<=5;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}*/
		//int row=1;
		/*for(int row=1; row<=5;row++) { 
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		for( int row=4;row>=1;row--) { 
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}*/
	}

}
