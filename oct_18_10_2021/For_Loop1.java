package oct_18_10_2021;

public class For_Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		For_Loop1 sara=new For_Loop1();
		sara.loop1();
	}

	public void loop1() {
		// TODO Auto-generated method stub
		/* 5 4 3 2 1
		   5 4 3 2
		   5 4 3 
		   5 4
		   5
		 */
		
		
		for(int row=1;row<=5;row++) { 
			for(int col=5;col>=row;col--) { 
				System.out.print(col+" ");
			}
			System.out.println();
		}

		
		/*int row=1;
		for(int col=5;col>=row;col--) { 
			System.out.print(col+" ");
		}
		System.out.println();
		row++;*/
		/*int row=2;
		for(int col=5;col>=row;col--) { 
			System.out.print(col+" ");
		}
		System.out.println();
		row++;*/
		
		/*for(int col=5;col>=1;col--) { 
			System.out.print(col+" ");
		}
		System.out.println();
		for(int col=5;col>=2;col--) { 
			System.out.print(col+" ");
		}
		System.out.println();
		for(int col=5;col>=3;col--) { 
			System.out.print(col+" ");
		}
		System.out.println();
		for(int col=5;col>=4;col--) { 
			System.out.print(col+" ");
		}
		System.out.println();
		for(int col=5;col>=5;col--) { 
			System.out.print(col+" ");
		}
		System.out.println();*/
	}
	

}
/* output :
 * 5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 

 */
 
