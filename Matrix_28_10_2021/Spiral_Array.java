package string_27_10_2021;

import java.util.Scanner;

public class Spiral_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("Enter The Value For N :");
				
				Scanner sc = new Scanner(System.in);
				
				int n = sc.nextInt();
				
				int[][] spiral = new int[n][n];
				
				int value = 1;
				
				int minCol = 0;//1
				
				int maxCol = n-1;//3//2
				
				int minRow = 0;//1
				
				int maxRow = n-1;//3
				
				while (value <= n*n)         
				{
					for (int i = minCol; i <= maxCol; i++)   //	 1<3   2<=2											
					{
						spiral[minRow][i] = value; 		  //[1][1]=13,[1][2]	   
							
						value++;
					}
					
					for (int i = minRow+1; i <= maxRow; i++)  // i=4,3<=3,   v=8
					{ 
						spiral[i][maxCol] = value;     	//[1][3]=5,   //[2][3]=6 //[3][3]=7
						
						value++; 
					} 
					
					for (int i = maxCol-1; i >= minCol; i--)//
					{
						spiral[maxRow][i] = value;  //
									
						value++;   ///11
					}
					
					for (int i = maxRow-1; i >= minRow+1; i--) 
					{
						spiral[i][minCol] = value;
						
						value++;  //13
					}
					
					minCol++;
					
					minRow++;
					
					maxCol--;
					
					maxRow--;
				}
				
				for (int i = 0; i < spiral.length; i++)
				{
					for (int j = 0; j < spiral.length; j++)
					{
						System.out.print(spiral[i][j]+ "\t");
					}
					
					System.out.println();
				}
		    }
	

	}
/* output :
 Enter The Value For N :
4

1	2	3	4	
12	13	14	5	
11	16	15	6	
10	9	8	7	
 */

