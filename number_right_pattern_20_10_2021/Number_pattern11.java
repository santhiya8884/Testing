package number_right_pattern_20_10_2021;

public class Number_pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_pattern11 sara=new Number_pattern11();
		sara.loop1();

	}

	public  void loop1() {
		// TODO Auto-generated method stub
		/*                  1-4, 2-3,3-2,4-1
		 1 * * * *       1 2 3 4 5
		 1 2 * * *       1 2 3 4
		 1 2 3 * *       1 2 3
		 1 2 3 4 *       1 2
		 1 2 3 4 5       1
		 
		 */
		/*	for(int row=1;row<=5;row++) { 
			for(int col=1;col<=row;col++) { 
				System.out.print(col+" ");
			}
			for(int star=4;star>=row;star--) {   
				System.out.print("*"+" ");
			}
		
			System.out.println();
		}*///
			int row=1;
			while (row<=5) { 
				int col=1;
				while (col<=row) {
					System.out.print(col+" ");
					col++;
				}
				int col1=1;
				while (col1<=5-row) { // 4<=4    =4       
					System.out.print("*"+" ");       
					col1++;
				}
				//value--;
				row++;
				System.out.println();
			}
	}

}
 /*
 1 * * * * 
1 2 * * * 
1 2 3 * * 
1 2 3 4 * 
1 2 3 4 5 
 
  */
   