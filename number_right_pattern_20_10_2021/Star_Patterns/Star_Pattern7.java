package number_right_pattern_20_10_2021;

public class Star_Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*		
        *   
      *   *   
    *   *   *   
  *   *   *   *   
*   *   *   *   *   
	*/
		for(int row=1;row<=5;row++) { 
			for(int col=4;col>=row;col--) { 
				System.out.print(" "+" ");
			}
			for(int col=1;col<=row;col++) { 
				System.out.print("*"+"   ");
			}
			System.out.println();
		}
	}

}
/*output :
         *   
      *   *   
    *   *   *   
  *   *   *   *   
*   *   *   *   *   
*   */
