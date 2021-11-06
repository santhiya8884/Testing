package string_5_11_2021;

public class Pramid_Benson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pramid_Benson sara=new Pramid_Benson();
		sara.pramid();
	}

	public void pramid() {
		// TODO Auto-generated method stub
	/*	  *
	     *2*
	    *2*4*
	   *2*4*6*
	*/
	/*
	 * for(int j=0;j<5;j++) { System.out.println(); }
	 */
	/*
	 * System.out.print("    "+" "); System.out.println("*");
	 * System.out.print("   "+" "); System.out.println("*");
	 * System.out.print("  "+" "); System.out.println("*");
	 * System.out.print(" "+" "); System.out.println("*");
	 */
//
	//int value=0;	
	
	for(int i=1;i<=5;i++) { 
		for(int col=5;col>i;col--) { 
			System.out.print(" "+" ");
		}
		int value=2;
		for(int k=1;k<=i;k++) { 
			System.out.print("* ");
			if(k>=i) { 
				break;
			}
			System.out.print(value+" ");
			value+=2;
		}
		System.out.println();
	}
		
}

}
/* output :
         * 
      * 2 * 
    * 2 * 4 * 
  * 2 * 4 * 6 * 
* 2 * 4 * 6 * 8 * 
*/
