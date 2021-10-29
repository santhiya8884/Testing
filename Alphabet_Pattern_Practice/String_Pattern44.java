package string_29_10_2021;

public class String_Pattern44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Pattern44 sara=new String_Pattern44();
		sara.pattern44();
	}

	public void pattern44() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) { 
			int value=65;
			for(int col=0;col<row;col++) { 
				System.out.print((char)value+" ");
				value++;
				//System.out.println((char)(value+col));
			}
			System.out.println();
		}
		int value1=65;
		for(int row=1;row<=6;row++) {
			
			System.out.print((char)(value1)+" ");
			value1++;
			
		}
		System.out.println();
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
 
 A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 


*/
