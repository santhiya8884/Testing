package string_29_10_2021;

public class String_Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Pattern1 sara=new String_Pattern1();
		sara.pattern1();

	}

	public void pattern1() {
		// TODO Auto-generated method stub
		int value=65;
		for(int row=1;row<=5;row++) {  
			for(int col=0;col<5;col++) { 
				System.out.print((char)(value)+" ");
			}
			System.out.println();
		}
		
	}

}
/* output :
 A A A A A 
A A A A A 
A A A A A 
A A A A A 
A A A A A 
*/
