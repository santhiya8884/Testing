package string_27_10_2021;

import java.util.Scanner;

public class Matrix_Col_Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix_Col_Total sara=new Matrix_Col_Total();
		sara.matrix_col_Total();
	}
	public void matrix_col_Total() { 
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
		int[] co=new int[row_count];
		for(int	row=0;row<marks.length;row++)  
		{
			// june--- p1 p 3     0 ,0     -1         //
			// july   p3 p4====7       1,
			int col_tot=0;
			for(int col=0;col<marks[row].length;col++) { 
				System.out.print(marks[row][col]+" ");   //     10 20   marks[0][0]=10,  marks[1][0]=30
				
				col_tot=col_tot+marks[col][row];     ///10+             
				co[row]=col_tot;										// marks[0][1]=20, marks[1][1]=40
			}
			//System.out.println(" ="+row_tot);
			
			System.out.println();
		}
		
		for(int rro=0;rro<co.length;rro++) { 
			System.out.println(rro+" col total "+co[rro]);
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
0 col total 40
1 col total 60
*/
