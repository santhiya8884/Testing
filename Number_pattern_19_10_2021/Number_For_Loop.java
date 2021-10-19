
package Number_pattern_19_10_2021;

public class Number_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_For_Loop sara=new Number_For_Loop();
		sara.loop1();

	}

	public void loop1() {
		// TODO Auto-generated method stub
		/* 
		 	1 
			2 3 
			4 5 6 
			7 8 9 10 
			11 12 13 14 15 
		 */
		int value=1;
		for(int row=1;row<=5;row++) { 
			for(int col=1;col<=row;col++) { 
				System.out.print(value+" ");
				value++;
			}
			System.out.println();
		}
		
	}

}
/*
 1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
*/
