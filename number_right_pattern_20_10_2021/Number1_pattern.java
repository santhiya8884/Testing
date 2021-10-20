package number_right_pattern_20_10_2021;

public class Number1_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number1_pattern sara=new Number1_pattern();
		sara.loop1();
	}

	public void loop1() {
		// TODO Auto-generated method stub
		//	int row=5;
		/* *
		   * 2 *
		   * 2 * 4 *
		   * 2 * 4 * 6 *
		 */
		  
		    /* 1 2 3 4 5   ----------row         1 2 3 4 5
		       1 2 3 4    ----------row	         1 2
		       1 2 3   ----------row		     1 2 3 
		       1 2   ----------row
		       1  ----------row
		    
		     */
		//static  int i;
		//int r=1;
		for(int row=1;row<=5;row++) {  // 5 1<=5 0 5<=1  4  4<=5  int con inc   

			for(int col=1;col<=row;col++) {  // 1,1  2<=1
				System.out.print(col+" ");
			}
			
			System.out.println();
			//r++;
		}
		
		/*	for(int j=5;j>=1;j--) {        // 1-5,2-4,3-3,4-2,5,1
			for(int i=1;i<=j;i++) {   
				 System.out.print(i+" ");
			 }
			 System.out.println();
			
		}*/
		   
		 
		  
		/* for(int i=1;i<=5;i++) { 
			 System.out.print(i+" ");
		 }
		 System.out.println();
		  
		 for(int i=1;i<=5;i++) { 
			 System.out.print(i+" ");
		 }
		 System.out.println();
		  
		 for(int i=1;i<=5;i++) { 
			 System.out.print(i+" ");
		 }
		 System.out.println();
		  
		 for(int i=1;i<=5;i++) { 
			 System.out.print(i+" ");
		 }
		 System.out.println();*/
		
		
		
		
		
		
		
		
		   /* for(int row=5;row>=1;row--)   //  3<=3 4<=2         5<=5, 4<=4
		    {
		      for(int col=1;col<=row;col++)
		      {
		        System.out.print(col+ " ");
		      }
		      
		    System.out.println();
		    }
		  */
		 
		
	}

}
/* 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
 */
