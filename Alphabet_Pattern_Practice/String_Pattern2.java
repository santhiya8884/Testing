package string_29_10_2021;

public class String_Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Pattern2 sara=new String_Pattern2();
		sara.pattern2();
	}
	public void pattern2() {
		// TODO Auto-generated method stub
		int value=65;
		for(int row=0;row<5;row++) {  
			for(int col=0;col<5;col++) { 
				System.out.print((char)(value+row)+" ");
			}
			System.out.println();
		}
		
	}
	
}
/* output :
A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E 
*/


