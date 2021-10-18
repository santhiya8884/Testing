package oct_18_10_2021;

public class While_Loop_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		While_Loop_Practice sara=new While_Loop_Practice();
		sara.loopPractice1();
		System.out.println();
		System.out.println();
		sara.loopPractice2();
		System.out.println();
		System.out.println();
		sara.loopPractice3();
		System.out.println();
		System.out.println();
		sara.loopPractice4();
		System.out.println();
		System.out.println();
		sara.loopPractice5();
		System.out.println();
		System.out.println();
		sara.loopPractice6();
		System.out.println();
		System.out.println();
		sara.loopPractice7();
		System.out.println();
		System.out.println();
		sara.loopPractice8();
		System.out.println();
		System.out.println();
		sara.loopPractice9();
		System.out.println();
		System.out.println();
		sara.loopPractice10();

		/*while(no<=5)
		{
		System.out.print(no + " "); 
		no++; 
		}
		
		no = 1; 
		while(no<=5)
		{
		System.out.print(no + " "); 
		no++; 
		} 
		no = 1; 
		while(no<=5)
		{
		System.out.print(no + " "); 
		no++; 
		} */

	}

		

	public void loopPractice10() {
		// TODO Auto-generated method stub
		
	}



	public void loopPractice9() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) {
			 
			for(int col=1;col<=row;col++)
			{
			System.out.print(col + " "); 
			
			} 
			System.out.println();
			
		}
	}

	public void loopPractice8() {
		// TODO Auto-generated method stub
		 
		for(int row=1;row<=5;row++) {
			 
			for(int col=5;col>=row;col--)
			{
			System.out.print(col + " "); 
			
			} 
			System.out.println();
			
		}
	}

	public void loopPractice7() {
		// TODO Auto-generated method stub
		int row=  1; 
		while (row<=4) {
			int col = 0; 
			while(col<=row)
			{
			System.out.print(col + " "); 
			col++; 
			} 
			System.out.println();
			row++;
		}
		
	}

	public void loopPractice6() {
		// TODO Auto-generated method stub
		int row=  1; 
		while (row<=4) {
			int col = 1; 
			while(col<=row)
			{
			System.out.print(col + " "); 
			col++; 
			} 
			System.out.println();
			row++;
		}
		
	}

	public void loopPractice5() {
		// TODO Auto-generated method stub
		
		for(int row=1;row<=3;row++) {
			//int col = 3; 
			for(int col=1;col<=row;col++) 
			{
			System.out.print(col + " "); 
			
			} 
			System.out.println();
			
		}
		
	}

	public void loopPractice4() {
		// TODO Auto-generated method stub
		/* 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 

*/	
		int row=  1; 
		while (row<=4) {
			int col = 3; 
			while(col<=row)
			{
			System.out.print(col + " "); 
			col++; 
			} 
			System.out.println();
			row++;
		}
		
	}

	public void loopPractice3() {
		// TODO Auto-generated method stub
		int count=  1; 
		while (count<=5) {
			int num = 5; 
			while(num>=count)
			{
			System.out.print(num + " "); 
			num--; 
			} 
			System.out.println();
			count++;
		}
		
	}

	public void loopPractice2() {
		// TODO Auto-generated method stub
		int count=  1; 
		while (count<=5) {
			int num = 1; 
			while(num<=count)
			{
			System.out.print(num + " "); 
			num++; 
			} 
			System.out.println();
			count++;
		}
		
	}

	public void loopPractice1() {
		// TODO Auto-generated method stub
		int count=  1; 
		while (count<=5) {
			int num = 1; 
			while(num<=5)
			{
			System.out.print(num + " "); 
			num++; 
			} 
			count++;
		}
		
	}

}
/* output :
 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 


5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 




3 
3 4 


1 
1 2 
1 2 3 


1 
1 2 
1 2 3 
1 2 3 4 


0 1 
0 1 2 
0 1 2 3 
0 1 2 3 4 


5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 


1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 


*/

