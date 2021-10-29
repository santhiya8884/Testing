package string_29_10_2021;

public class String_Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Pattern22 sara=new String_Pattern22();
		sara.pattern22();
	}

	public void pattern22() {
		// TODO Auto-generated method stub
	/*	A
		A B
		A B C
		A B C D
		A B C D E*/
		
	/*	int row=0;
		for(int col=0;col<row;col++) { 
			int value=65;
			System.out.println((char)(value+col));
			value++;
		}*/
	/*	int row=1,value=65;
		for(int col=0;col<=row;col++) { 
			System.out.print((char)value+" ");
			value++;
			//System.out.println((char)(value+col));
		}
		*/
		for(int row=1;row<=5;row++) { 
			int value=65;
			for(int col=0;col<row;col++) { 
				System.out.print((char)value+" ");
				value++;
				//System.out.println((char)(value+col));
			}
			System.out.println();
		}
		
		
	/*	int value=65;
		System.out.println((char)value);
		
		
		value=65;
		System.out.print((char)value+" ");
		value++;
		System.out.println((char)value);
		
		value=65;
		System.out.print((char)value+" ");
		value++;
		System.out.print((char)value+" ");
		value++;
		System.out.println((char)value);
		
		value=65;
		System.out.print((char)value+" ");
		value++;
		System.out.print((char)value+" ");
		value++;
		System.out.print((char)value+" ");
		value++;
		System.out.println((char)value+" ");
		value++;
		
		value=65;
		System.out.print((char)value+" ");
		value++;
		System.out.print((char)value+" ");
		value++;
		System.out.print((char)value+" ");
		value++;
		System.out.print((char)value+" ");
		value++;
		System.out.println((char)value+" ");
		value++;
		*/
		/*for(int row=0;row<5;row++) { 
			int value=65;
			for(int col=row;col<=row;col++) {
				System.out.print((char)(value+row)+" ");
			}
			System.out.println();
		}*/
	}

}
/* output :
 A 
A B 
A B C 
A B C D 
A B C D E 
*/
