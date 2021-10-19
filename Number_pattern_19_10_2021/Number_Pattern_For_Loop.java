package Number_pattern_19_10_2021;

public class Number_Pattern_For_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Number_Pattern_For_Loop  sara=new Number_Pattern_For_Loop();
		 sara.loop1();
		

	}

	public void loop1() {
		// TODO Auto-generated method stub
		/*
		 1 
		 3 5 
		 7 9 11 
		 13 15 17 19 
		 21 23 25 27 29 */
		int value=1;
		for(int row=1;row<=5;row++) { 
			for(int col=1;col<=row;col++) { 
				System.out.print(value+" ");
				value=value+2;
			}
			System.out.println();
		}
	}

}
/*
 1 
3 5 
7 9 11 
13 15 17 19 
21 23 25 27 29 
*/
