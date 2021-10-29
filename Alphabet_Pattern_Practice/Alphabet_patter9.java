package string_29_10_2021;

public class Alphabet_patter9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabet_patter9 sara=new Alphabet_patter9();
		sara.pattern9();
	}

	private void pattern9() {
		// TODO Auto-generated method stub
	/*	 A B C D E F
		 A B C D E
		 A B C D 
		 A B C 
		 A B 
		 A*/
		for(int row=5;row>=0;row--) { // 5 4 3 21 0
			int value=65;
			
			for(int col=0;col<=row;col++) {
				System.out.print((char)(value)+" ");
				value++;
			}
			System.out.println();
		
	}

	}
}
/* output :
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
*/