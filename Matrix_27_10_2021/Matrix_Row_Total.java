package string_27_10_2021;

import java.util.Scanner;

public class Matrix_Row_Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix_Row_Total  sara=new Matrix_Row_Total();
		sara.matrix_row_Total();
	}
	public void matrix_row_Total() { 
		// 1 2====3     0 ,0      -1         //
		// 3 4====7
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and col :");
		int row_count=sc.nextInt();
		int col_count=sc.nextInt();
		int[][] marks=new int[row_count][col_count];
		for(int	row=0;row<marks.length;row++)
		{
			for(int col=0;col<marks[row].length;col++) { 
				System.out.println("Enter the mark:");
				marks[row][col]=sc.nextInt();
			}
		}
		int[] ro=new int[row_count];
		for(int	row=0;row<marks.length;row++)
		{
			int row_tot=0;
			for(int col=0;col<marks[row].length;col++) { 
				System.out.print(marks[row][col]+" ");   //     10 20 
				row_tot=row_tot+marks[row][col];
				ro[row]=row_tot;
			}
		//	System.out.println(" ="+row_tot);
			
			System.out.println();
		}
		
		for(int rro=0;rro<ro.length;rro++) { 
			System.out.println(rro+" row total "+ro[rro]);
		}

		
		
	}

}

/* output :
Enter the row and col :
2
2
Enter the mark:
10
Enter the mark:
20
Enter the mark:
30
Enter the mark:
40
10 20 
30 40 
0 row total 30
1 row total 70
*/