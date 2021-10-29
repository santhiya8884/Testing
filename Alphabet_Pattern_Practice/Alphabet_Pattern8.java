package string_29_10_2021;

public class Alphabet_Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabet_Pattern8 sara=new Alphabet_Pattern8();
		sara.pattern8();
	}

	public void pattern8() {
		// TODO Auto-generated method stub
	/*	F
		F E
		F E D
		F E D C 
		F E D C B
		F E D C B A*/
		
		
		for(int row=0;row<=5;row++) { // 5 4 3 21 0
			int value=65;
			int v1=value+5;
			for(int col=0;col<=row;col++) {
				System.out.print((char)(v1)+" ");
				v1--;
			}
			System.out.println();
		}
	}

}
/* output :
 * F 
F E 
F E D 
F E D C 
F E D C B 
F E D C B A 
*/
 


