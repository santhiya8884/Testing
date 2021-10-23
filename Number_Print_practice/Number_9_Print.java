package letters_pattern_practice_21_10_2021;

public class Number_9_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_9_Print sara=new Number_9_Print();
		sara.letter_e();

	}

	public void letter_e() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) {
			if(row==1||row==7) { 
				for(int col=1;col<=5;col++) {
					System.out.print("*"+" ");
				}
			}
			else {
				for(int col=1;col<=5;col++) { 
					if(col==1||col==5) {
						System.out.print("*"+" ");
					}
					else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
		for(int row=1;row<=4;row++) { 
			System.out.println("        *");
			}
		for(int row=1;row<=5;row++) { 
			if(row==4) {
				System.out.print("*");
				break;
			}
			System.out.print("*"+" ");
			if(row==5) {}
			}
	
		
			
	}
	

}
