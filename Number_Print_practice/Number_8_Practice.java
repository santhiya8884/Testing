package letters_pattern_practice_21_10_2021;

public class Number_8_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_8_Practice sara=new Number_8_Practice();
		sara.number_8();

	}
public void number_8() {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) { 
			if(row==1) { 
				for(int col=1;col<=5;col++) { 
					System.out.print("*"+" ");
				}
			}
			else if(row==7) { 
				for(int k=1;k<=5;k++) { 
					if(k==1||k==5) { 
						System.out.print("  ");
					}
					else { 
						System.out.print("*"+" " );
					}
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
		for(int row=1;row<=7;row++) { 
			if(row==7) { 
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
	}

}
