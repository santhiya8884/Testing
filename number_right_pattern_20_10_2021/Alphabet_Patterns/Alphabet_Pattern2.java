package number_right_pattern_20_10_2021;

public class Alphabet_Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabet_Pattern3 sara=new Alphabet_Pattern3();
		sara.alphabet3();
	}
	public void alphabet3() {
		// TODO Auto-generated method stub
		int value=65;
		for(int row=1;row<=5;row++) { 
			for(int col=0;col<5;col++) { 
				//System.out.print((char)(value)+" ");
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
A B C D E 
*/
