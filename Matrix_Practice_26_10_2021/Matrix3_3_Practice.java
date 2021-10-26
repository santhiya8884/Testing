package array_26_10_2021;

import java.util.Scanner;

public class Matrix3_3_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix3_3_Practice sara=new Matrix3_3_Practice();
		//sara.Dimensional3_3();
		sara.Dimensional33Again();
	}

	

	public void Dimensional33Again() {
		// TODO Auto-generated method stub
		
		int[][][] marks=new int[2][3][2];
		System.out.println(marks.length);
		System.out.println(marks[0].length);
		System.out.println(marks[0][0].length);
		Scanner sc=new Scanner(System.in);
		
		for(int stu=0;stu<marks.length;stu++) { 
			for(int month=0;month<marks[0].length;month++) { 
				for(int paper=0;paper<marks[0][month].length;paper++) { 
					//System.out.print(marks[0][0][p]+" ");
					System.out.print("Enter the mark : ");
					marks[stu][month][paper]=sc.nextInt();
				}
			}
		}
		for(int stu=0;stu<marks.length;stu++) { 
			for(int month=0;month<marks[0].length;month++) { 
				for(int paper=0;paper<marks[0][month].length;paper++) { 
					System.out.print(marks[stu][month][paper]+"\t");
					//marks[stu][month][paper]=sc.nextInt();
				}
				System.out.println();
			}
		}
		/*for(int month=0;month<marks[0].length;month++) { 
			for(int p=0;p<marks[0][month].length;p++) { 
				//System.out.print(marks[0][0][p]+" ");
				marks[0][month][p]=sc.nextInt();
			}
		}
		for(int month=1;month<marks[0].length;month++) { 
			for(int p=0;p<marks[0][month].length;p++) { 
				//System.out.print(marks[0][0][p]+" ");
				marks[1][month][p]=sc.nextInt();
			}
		}*/
		/*
		for(int p=0;p<marks[0][0].length;p++) { 
			//System.out.print(marks[0][0][p]+" ");
			marks[0][0][p]=sc.nextInt();
		}
		for(int p=1;p<marks[0][0].length;p++) { 
			//System.out.print(marks[0][0][p]+" ");
			marks[0][0][p]=sc.nextInt();
		}*/
		
		
		/*marks[0][0][0]=sc.nextInt();
		marks[0][0][1]=sc.nextInt();
		marks[0][0][2]=sc.nextInt();
		marks[0][0][3]=sc.nextInt();*/

		
		
		
		
	}



	private void Dimensional3_3() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  member value row value and column value :");
		int k_count=sc.nextInt();
		int row_count=sc.nextInt();
		int col_count=sc.nextInt();
		
		int[][][] marks=new int[k_count][row_count][col_count];
		int tot=0;
		for(int k=0;k<marks.length;k++) { 
			for(int row=0;row<marks[0].length;row++) { 
				//int row_tot=0;
				for(int col=0;col<marks[0][row].length;col++) { 
					System.out.println("Enter the marks: ");
					marks[k][row][col]=sc.nextInt();
					//tot=tot+marks[row][col];
					//row_tot=row_tot+marks[row][col];
				}
				System.out.println();
			}
			
			
		}
		/*for(int row=0;row<marks.length;row++) { 
			//int row_tot=0;
			for(int col=0;col<marks[row].length;col++) { 
				System.out.println("Enter the marks: ");
				marks[row][col]=sc.nextInt();
				tot=tot+marks[row][col];
				//row_tot=row_tot+marks[row][col];
			}
		}*/
		/*for(int k=0;k<marks.length;k++) { 
			for(int row=0;row<marks[0].length;row++) { 
				
				for(int col=0;col<marks[0][row].length;col++) { 
					System.out.print(marks[k][row][col]+"\t");
					
				}
				System.out.println();
			}
			
		}
		*/
		//System.out.println(marks[1][1][2]);
	}

	

}

/* outpiut :
2
3
2
Enter the mark : 10
Enter the mark : 20
Enter the mark : 30
Enter the mark : 40
Enter the mark : 50
Enter the mark : 60
Enter the mark : 70
Enter the mark : 70
Enter the mark : 90
Enter the mark : 100
Enter the mark : 110
Enter the mark : 120
10	20	
30	40	
50	60	
70	70	
90	100	
110	120	
*/