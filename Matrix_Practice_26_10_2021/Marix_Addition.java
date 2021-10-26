package array_26_10_2021;

public class Marix_Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marix_Addition sara=new Marix_Addition();
		sara.matrixAddition1();
	//	sara.matrixMul2();
	}

	public void matrixMul2() {
		// TODO Auto-generated method stub
		int[][] a= {{1,5},{2,6}};
		int[][] b= {{2,3},{7,6}};
		int[][] c=new int[2][2]; 
		//a    //b
	//	1 5   //  2 3
	//	2 6   // 7 6
		 // 1 5    a[0][0]  a[0][1]  ///(1*2)+(5*7)   (1*3)+(5*6)== 37 33
		//   2 6   a[1][0]  a[1][1] ////(2*2)+(6*7)   (2*3)+(6*6)== 46 42
		
		// 2 3    b[0][0]  b[0][1]
		// 7 6    b[1][0]  b[1][1]
		
		 //        c[0][0]  c[0][1]  == (a[0][0]*b[0][0])+(a[0][1]*b[1][0]) (a[0][0]*b[0][1])+(a[0][1]*b[1][1])
		
		 //        c[1][0]  c[1][1]  == (a[1][0]*b[0][0])+(a[1][1]*b[1][0]) (a[1][0]*b[0][1])+(a[1][1]*b[1][1])
		
		
		
		 for(int row=0;row<1;row++) {
			 int col=0;
			 for(;col<c[row].length;col++){ 
				 c[row][col]=(a[row][col]*b[row][col])+(a[row][col]*b[row][col]);
				 System.out.print(c[row][col]+"  ");
			 }
			 
		 }
		 
		
		 
		
		
		
		
		
		
	}

	public void matrixAddition1() {
		// TODO Auto-generated method stub
		int[][] a= {{1,5},{2,6}};   // 1 5    a[0][0]  a[0][1]  ///(1*2)+(5*7)   (1*3)+(5*6)== 37 33
									// 2 6    a[1][0]  a[1][1] ////(2*2)+(6*7)   (2*3)+(6*6)== 46 42
		
		int[][] b= {{2,3},{7,6}};   // 2 3    b[0][0]  b[0][1]
									// 7 6    b[1][0]  b[1][1]
		
		int[][] c=new int[2][2];    //        c[0][0]  c[0][1]
									//        c[1][0]  c[1][1]
		
		//3 8   5        a[][]
		//9 12  5
		
		// c[0][0] =a[0][0]+b[0][0];
		// c[0][1] =a[0][1]+b[0][1];
		 
		
		 
		 for(int row=0;row<c.length;row++) { 
			 
			 for(int col=0;col< c[row].length;col++) { 
				 c[row][col] =a[row][col]+b[row][col];  //3  8 
				 
			 }											//5  6
			// System.out.println();
		 }
		 
		 
		 for(int row=0;row<c.length;row++) { 
			 
			 for(int col=0;col< c[row].length;col++) { 
				 System.out.print( c[row][col]+" ");
			 }
			System.out.println();
		 }
		 
		/* int row=0;
		 for(int col=0;col< c[row].length;col++) { 
			 c[row][col] =a[row][col]+b[row][col];
		 }
		
		 row=1;
		 for(int col=0;col< c[row].length;col++) { 
			 c[row][col] =a[row][col]+b[row][col];
		 }
		
		*/
		
	}

}
/* output :
 3 8 
9 12 
*/
