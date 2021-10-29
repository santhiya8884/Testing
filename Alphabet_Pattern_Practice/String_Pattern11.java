package string_29_10_2021;

public class String_Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Pattern11  sara=new String_Pattern11 ();
		sara.pattern11();
		
	}

	public void pattern11() {
		// TODO Auto-generated method stub
		int value=65;
		for(int row=0;row<5;row++) { 
			for(int col=0;col<=row;col++) {
				System.out.print((char)(value+row)+" ");
			}
			System.out.println();
		}
		
	}

}
/* output :
 A 
B B 
C C C 
D D D D 
E E E E E 
*/
