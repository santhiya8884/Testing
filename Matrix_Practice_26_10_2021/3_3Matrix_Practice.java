package array_26_10_2021;

import java.util.Scanner;

public class Matrix_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix_Practice sara=new Matrix_Practice();
		sara.matrix_Practice();
		
		}

	public void matrix_Practice() {
		// TODO Auto-generated method stub
		int[] june=new int[5];
		int[] july=new int[5];
		int[] augest=new int[5];
		int[][] marks=new int[3][3];
		/*System.out.println(marks.length);
		System.out.println(marks[0].length);
		System.out.println(marks[1].length);
		System.out.println(marks[2].length);*/
		Scanner sc=new Scanner(System.in);
		
		for(int row=0;row<marks.length;row++) { 
			for(int col=0;col<marks[row].length ;col++) { 
				System.out.println("Enter the marks :");
				marks[row][col]=sc.nextInt();
				
			}
		}
		System.out.println("Result is :");
		for(int row=0;row<marks.length;row++) { 
			for(int col=0;col<marks[row].length ;col++) { 
				System.out.print(marks[row][col]+"\t");
			}
			System.out.println();
		}

		/* row=1;
		

		 row=2;
		for(int col=0;col<marks[row].length ;col++) { 

			marks[row][col]=70;
			marks[row][col]=60;
			marks[row][col]=50;
		}
		*/
		
	/*	int row=0;
		for(int col=0;col<marks[row].length ;col++) { 

			marks[row][col]=70;
			marks[row][col]=60;
			marks[row][col]=50;
		}

		 row=1;
		for(int col=0;col<marks[row].length ;col++) { 

			marks[row][col]=70;
			marks[row][col]=60;
			marks[row][col]=50;
		}

		 row=2;
		for(int col=0;col<marks[row].length ;col++) { 

			marks[row][col]=70;
			marks[row][col]=60;
			marks[row][col]=50;
		}
*/
		
		
	/* 	marks[0][0]=70;
		marks[0][1]=60;
		marks[0][2]=50;
		
		marks[1][0]=90;
		marks[1][1]=66;
		marks[1][2]=10;
		
		marks[2][0]=30;
		marks[2][1]=20;
		marks[3][2]=50;
*/
		
	}

}
/* output :
 *Enter the marks :
1
Enter the marks :
2
Enter the marks :
3
Enter the marks :
4
Enter the marks :
5
Enter the marks :
6
Enter the marks :
7
Enter the marks :
8
Enter the marks :
9
Result is :
1	2	3	
4	5	6	
7	8	9
*/
