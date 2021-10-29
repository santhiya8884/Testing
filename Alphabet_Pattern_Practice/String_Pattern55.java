package string_29_10_2021;

public class String_Pattern55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Pattern55 sara=new String_Pattern55();
		sara.pattern55();
	}

	public void pattern55() {
		// TODO Auto-generated method stub
		for(int row=6;row>=0;row--) { 
			int value=65;
			for(int col=1;col<=row;col++) { 
				
				System.out.print((char)(value)+" ");
				value++;
			}
			if(row==0) { 
				
			}
			else { 
				System.out.println();
			}
		}
		for(int row=1;row<=6;row++) { 
			int value=65;
			for(int col=1;col<=row;col++) { 
				
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
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 
 */

