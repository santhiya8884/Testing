package letters_pattern_practice_21_10_2021;

public class Letter1_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter1_Practice  sara=new Letter1_Practice ();
		sara.letter1();
	}

	public void letter1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) { 
			if( row==1||row==7) {
				for(int col=1;col<=5;col++) {
					System.out.print("*"+" ");
				}
			}
			if(row==4) {
				for(int col=1;col<=3;col++) {
					System.out.print("*"+" ");
				}
			}
			/*if(row==7) {
				for(int col=1;col<=5;col++) {
					System.out.print("*"+" ");
				}
			}*/
			
			System.out.println("*");
		}
		
	}
	

}
