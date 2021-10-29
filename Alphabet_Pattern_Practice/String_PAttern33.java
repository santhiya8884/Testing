package string_29_10_2021;

public class String_PAttern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_PAttern33  sara=new String_PAttern33 ();
		sara.pattern33();
		
	}

	public void pattern33() {
		// TODO Auto-generated method stub
		for(int row=5;row>=1;row--) { 
			int value=65;
			for(int col=0;col<row;col++) { 
				System.out.print((char)value+" ");
				value++;
				//System.out.println((char)(value+col));
			}
			System.out.println();
		}
	}
}

	/* output :
A B C D E 
A B C D 
A B C 
A B 
A 

	 */


