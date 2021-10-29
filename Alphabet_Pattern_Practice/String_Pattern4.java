package string_29_10_2021;

public class String_Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Pattern4 sara=new String_Pattern4();
		sara.pattern4();
	}

	public void pattern4() {
		// TODO Auto-generated method stub
			int value=65;
			for(int row=5;row>0;row--) {  
				for(int col=5;col>0;col--) { 
					System.out.print((char)(value+row)+" ");
				}
				System.out.println();
			}
			
		}
		
	}
/* output :
 F F F F F 
E E E E E 
D D D D D 
C C C C C 
B B B B B 
*/
