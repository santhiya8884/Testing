package string_29_10_2021;

public class String_Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Pattern3 sara=new String_Pattern3();
		sara.pattern3();
	}
	public void pattern3() {
		// TODO Auto-generated method stub
		int value=65;
		for(int row=0;row<5;row++) {  
			for(int col=0;col<5;col++) { 
				System.out.print((char)(value+col)+" ");
			}
			System.out.println();
		}
		
	}


}
/* output :
 A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E */
