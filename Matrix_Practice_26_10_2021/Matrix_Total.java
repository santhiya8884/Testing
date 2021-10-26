package array_26_10_2021;

import java.util.Scanner;

public class Matrix_Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix_Total sara=new Matrix_Total();
		sara.matrix_Toal();
	}

	public void matrix_Toal() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row value and column value :");
		int row_count=sc.nextInt();
		int col_count=sc.nextInt();
		int[][] marks=new int[row_count][col_count];
		int tot=0;
		for(int row=0;row<marks.length;row++) { 
			//int row_tot=0;
			for(int col=0;col<marks[row].length;col++) { 
				System.out.println("Enter the marks: ");
				marks[row][col]=sc.nextInt();
				tot=tot+marks[row][col];
				//row_tot=row_tot+marks[row][col];
			}
		}
		
		for(int row=0;row<marks.length;row++) { 
		
			for(int col=0;col<marks[row].length;col++) { 
				System.out.print(marks[row][col]+"\t");
				
			}
			System.out.println();
		}
		System.out.println("Total of the matrix :"+tot);
		
	}

}
/* output :
 Enter the row value and column value :
2
3
Enter the marks: 
1
Enter the marks: 
2
Enter the marks: 
3
Enter the marks: 
4
Enter the marks: 
5
Enter the marks: 
6
1	2	3	
4	5	6	
Total of the matrix :21
*/
