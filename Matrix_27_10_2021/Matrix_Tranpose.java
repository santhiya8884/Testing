package string_27_10_2021;

import java.util.Scanner;

public class Matrix_Tranpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix_Tranpose sara=new Matrix_Tranpose();
		sara.matrixTranspose();
	}

	public void matrixTranspose() {
		
	        int i, j;  
	        System.out.println("Enter total rows and columns: ");  
	        Scanner s = new Scanner(System.in);  
	        int row = s.nextInt();  
	        int column = s.nextInt();  
	        int array[][] = new int[row][column];  
	        System.out.println("Enter matrix:");  
	        for(i = 0; i < row; i++)  
	        {  
	            for(j = 0; j < column; j++)   
	                {  
	                array[i][j] = s.nextInt();  
	                System.out.print(" ");  
	                }  
	        }  
	        System.out.println("The above matrix before Transpose is ");  
	        for(i = 0; i < row; i++)  
	            {  
	                for(j = 0; j < column; j++)  
	                {  
	                System.out.print(array[i][j]+"\t");  
	                }  
	                System.out.println(" ");  
	            }  
	        System.out.println("The above matrix after Transpose is ");  
	        for(i = 0; i < column; i++)  
	            {  
	                for(j = 0; j < row; j++)  
	                {  
	                    System.out.print(array[j][i]+"\t");  
	                }  
	                System.out.println(" ");  
	            }  
	        }  
	    
	}
/* output :
Enter total rows and columns: 
4
4
Enter matrix:
1
 2
 3
 4
 5
 6
 7
 8
 9
 10
 11
 12
 13
 14
 15
 16
 The above matrix before Transpose is 
1	2	3	4	 
5	6	7	8	 
9	10	11	12	 
13	14	15	16	 
The above matrix after Transpose is 
1	5	9	13	 
2	6	10	14	 
3	7	11	15	 
4	8	12	16
 */
	
