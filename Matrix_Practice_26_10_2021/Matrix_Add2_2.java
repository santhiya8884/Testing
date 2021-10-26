package array_26_10_2021;

import java.util.Scanner;

public class Matrix_Add2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			Matrix_Add2_2 sara=new Matrix_Add2_2();
			//sara.matrix1();
				int [][]marks = new int[2][3]; 
				
				for(int row=0;row<marks.length;row++)
				{
				for(int col=0;col<marks[row].length;col++)
				{
					System.out.print ("Enter mark ");
					marks[row][col] = sc.nextInt();
				}
			
				}
				
				for(int row=0;row<marks.length;row++)
				{
					int total = 0;
				for(int col=0;col<marks[row].length;col++)
				{
					//total = total+marks[row][col];
					System.out.print(marks[row][col]+" ");
				}
				//System.out.println("Total " + total);
				System.out.println();
				}
			
				
			}

	private void matrix1() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Rows");
			int row=sc.nextInt();
			System.out.println("Enter the Columns");
			int col=sc.nextInt();
			int a[][]=new int[row][col];
			int b[][]=new int[row][col];
			int c[][]=new int[row][col];
			for(int i=0;i<c.length;i++)
			{
				for(int j=0;j<c[i].length;j++)
				{
					a[i][j]=sc.nextInt();//a[0][0]=1,a[0][1],   a[1][0],a[]1[]
					
				}
			}
			for(int i=0;i<c.length;i++)
			{
				for(int j=0;j<c[i].length;j++)
				{
					b[i][j]=sc.nextInt();
					
				}
			}
			System.out.println("REsult is");
			for(int i=0;i<c.length;i++)
			{
				for(int j=0;j<c[i].length;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		

	
	/*sys
	
	//   2  3   int a[][]=new[3][2];     
	//   1  4  
		 7  9  
		 array.length();
		 arr[row].leng
	
		 
		 for( int row=0;row<a.length  ;row++) {
			
			 for(int col=0;col<a[row].length;col++) {     
				 System.out.println("enter");
				 a[row][col]=sc.nextInt();
				
			 }
		 }
		 int row=0;
		 for(int col=0;col<2;col++) { 
			 a[row][col]=2;
			 a[row][col]=3;
		 }
		 int row=1;
		 for(int col=0;col<2;col++) { 
			 a[row][col]=2;
			 a[row][col]=3;
		 }
		 int row=2;
		 for(int col=0;col<2;col++) { 
			 a[row][col]=2;
			 a[row][col]=3;
		 }
		 
		 
		 a[0][0]=2;
		 a[0][1]=3;
		
		 a[1][0]=1;
		 a[1][1]=4;
		 
		 a[2][0]=1;
		 a[2][1]=4;
	
	
*/
		
	}
/* output :
 Enter mark 1
Enter mark 2
Enter mark 3
Enter mark 4
Enter mark 5
Enter mark 6
1 2 3 
4 5 6 
*/
