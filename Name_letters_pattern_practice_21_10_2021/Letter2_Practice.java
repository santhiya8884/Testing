package letters_pattern_practice_21_10_2021;

public class Letter2_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter2_Practice  sara=new Letter2_Practice();
		sara.letter2();

	}
	public void letter2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row==1||row==7) {
				for(int col=1;col<=5;col++) { 
					System.out.print("*"+" ");
				}
			}
			System.out.println("*");
		}
	
}
}
/* output :

* * * * * *
*
*
*
*
*
* * * * * *

*/
