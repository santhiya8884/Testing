package oct_18_10_2021;

public class While_Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		While_Loop5 sara=new While_Loop5();
		sara.loop();
	}

	public void loop() {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=5;i++) { 
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1;i<=4;i++) { 
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1;i<=3;i++) { 
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1;i<=2;i++) { 
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1;i<=1;i++) { 
			System.out.print(i+" ");
		}
		System.out.println();*/
		/*for (int row = 5; row>=1 ; row--) {
			for(int col=1;col<=row;col++) { 
				System.out.print(col+" ");
			}
			System.out.println();
		}*/
		System.out.println();
	/*int col=1;	
	while (col<=5) {
		System.out.print(col+" ");
		col++;
	}*/
	int row=5;
	while (row>=1) {
		int col=1;	
		while (col<=row) {
			System.out.print(col+" ");
			col++;
		}
		System.out.println();
		row--;
	}
	/*int col=1;	
	while (col<=3) {
		System.out.print(col+" ");
		col++;
	}
	int col=1;	
	while (col<=2) {
		System.out.print(col+" ");
		col++;
	}
	int col=1;	
	while (col<=1) {
		System.out.print(col+" ");
		col++;
	}*/
	}

}
/* output 
 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
