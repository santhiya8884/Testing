package array_26_10_2021;

import java.util.Scanner;

public class Matrix_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix_Array sara=new Matrix_Array();
		sara.matrix();

	}

	public void matrix() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row col vaule");
		int row_count=sc.nextInt();
		int col_count=sc.nextInt();
	//	int[][] matric=new int[2][5];
		int[][] matric=new int[row_count][col_count];
		for(int row=0;row<matric.length;row++) { 
			for(int col=0;col<matric[row].length;col++) { 
				System.out.println("Enter the mark :");
				matric[row][col]=sc.nextInt();
			}
		}
		//int row_tot=0;
		int matric_tot=0;
		for(int row=0;row<matric.length;row++) {
			int row_tot=0;
			int col_tot=0;
			for(int col=0;col<matric[row].length;col++) { 
				System.out.print(matric[row][col]+" ");
				row_tot=row_tot+matric[row][col];
				
				matric_tot=matric_tot+matric[row][col];
			}
			System.out.println();
		
		}
		
		System.out.println("total of matric"+matric_tot);
	}

}
/* output :
 Enter the row col vaule
2
2
Enter the mark :
2
Enter the mark :
3
Enter the mark :
4
Enter the mark :
5
2 3 
4 5 
total of matric14
*/
