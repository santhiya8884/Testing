package string_29_10_2021;

public class String_Pattern66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Pattern66 sara=new String_Pattern66();
		sara.pattern66();
	}

	public void pattern66() {
		// TODO Auto-generated method stub
		int value=65;
		for(int row=6;row>=1;row--) { 
			int v1=value+(row-1);
			for(int col=0;col<row;col++) {
				//int v1=value+(row-1);
				System.out.print((char)(v1)+" ");
				v1--;
			}
			System.out.println();
		}
		for(int row=1;row<=6;row++) { 
			int v1=value+(row-1);
			for(int col=0;col<row;col++) {
				//int v1=value+(row-1);
				System.out.print((char)(v1)+" ");
				v1--;
			}
			System.out.println();
		}
	}

}

/* output :
F E D C B A 
E D C B A 
D C B A 
C B A 
B A 
A 
A 
B A 
C B A 
D C B A 
E D C B A 
F E D C B A 

 */


