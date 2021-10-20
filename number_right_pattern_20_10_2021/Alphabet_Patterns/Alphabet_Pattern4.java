package number_right_pattern_20_10_2021;

public class Alphabet_Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabet_Pattern4 sara=new Alphabet_Pattern4();
		sara.alphabet1();
	}
	public void alphabet1() {
		// TODO Auto-generated method stub
		int value=65;
		for(int row=1;row<=5;row++) { 
			for(int col=0;col<row;col++) { 
				//System.out.print((char)(value)+" ");
				System.out.print((char)(value+col)+" ");
			}
			System.out.println();
			
		}
	}

}/* output :
A 
A B 
A B C 
A B C D 
A B C D E 
*/
