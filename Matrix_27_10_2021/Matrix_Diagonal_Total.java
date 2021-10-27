package string_27_10_2021;

import java.util.Scanner;

public class Matrix_Diagonal_Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix_Diagonal_Total sara=new Matrix_Diagonal_Total();
		sara.matrix_diagonal_Total();
	}
public void matrix_diagonal_Total() {  
		
		// 1 2====3     0 ,0     -1         //   mark[0][0]+mark[1][1]=5
		// 3 4====7       1,
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
		int col_tot=0;
		int[] co=new int[row_count];
		for(int	row=0;row<marks.length;row++)  
		{
			// 1 2====3     0 ,0     -1         //
			// 3 4====7       1,
			
			for(int col=0;col<marks[row].length;col++) { 
				System.out.print(marks[row][col]+" ");   //     10 20   marks[0][0]=10,  marks[1][0]=30
				if(row==col) {
					col_tot=col_tot+marks[col][row];                 
					co[row]=col_tot;
				}
														// marks[0][1]=20, marks[1][1]=40
			}
			//System.out.println(" ="+row_tot);
			
			System.out.println();
		}
		System.out.println(" diagonal total "+col_tot);
		/*for(int rro=0;rro<co.length;rro++) { 
			System.out.println(rro+" col total "+co[rro]);
		}*/

		
	}
}
/* output :
 * Enter the row and col :
3
3
Enter the mark:
1
Enter the mark:
2
Enter the mark:
3
Enter the mark:
4
Enter the mark:
5
Enter the mark:
6
Enter the mark:
7
Enter the mark:
8
Enter the mark:
9
1 2 3 
4 5 6 
7 8 9 
 diagonal total 15
*/
