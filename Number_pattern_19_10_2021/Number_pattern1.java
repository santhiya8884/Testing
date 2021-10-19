package Number_pattern_19_10_2021;

public class Number_pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_pattern1 sara= new Number_pattern1();
		sara.pattern_Number();
		

	}

	public void pattern_Number() {
		// TODO Auto-generated method stub
		//System.out.println(1+" ");
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) { 
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		for(int row=1;row<=5;row++) {
			for(int col=5;col>=row;col--) { 
				System.out.print(col+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	for(int row=5;row>=1;row--) { 
		for(int col=5;col>=row;col--) {
			System.out.print(col+" ");
		}
		System.out.println();
	}
	//int value=1;
	for(int row=1;row<=4;row++) {
		for(int col=1;col<=row;col++) { 
			System.out.print(col+" ");
			
		}
		System.out.println();
	}
	for(int row=1;row<=4;row++) {
		for(int col=1;col<=row;col++) { 
			System.out.print("*"+" ");
			
		}
		System.out.println();
	}
	
	for(int row=1;row<=4;row++) {
		for(int col=1;col<=row;col++) { 
			System.out.print(row+" ");
			
		}
		System.out.println();
	}
	for(int row=1;row<=4;row++) {
		for(int col=1;col<=row;col++) { 
			System.out.print((row*col)+" ");
			
		}
		System.out.println();
	}
	for(int row=1;row<=4;row++) {
		for(int col=1;col<=row;col++) { 
			System.out.print((row-col)+" ");
			
		}
		System.out.println();
	}
	for(int row=1;row<=4;row++) {
		for(int col=1;col<=row;col++) { 
			System.out.print((row/col)+" ");
			
		}
		System.out.println();
	}
	for(int row=1;row<=4;row++) {
		for(int col=1;col<=row;col++) { 
			System.out.print((row%col)+" ");
			
		}
		System.out.println();
	}
	int value=1;
	for(int row=1;row<=4;row++) {
		for(int col=1;col<=row;col++) { 
			System.out.print(value+" ");
			value++;
			
		}
		System.out.println();
	}
	for(int row=1;row<=4;row++) {
		for(int col=1;col<=row;col++) { 
			System.out.print(value+" ");
			value++;
			
		}
		System.out.println();
	}
	
	//System.out.println(1+" ");
	int j=1;
	for(int row=1;row<=5;row++) {
		for(int col=row;col<=j;col++) { 
			System.out.print(col+" ");
		}
		System.out.println();
		j=j+2;
	}
	
	
	
	}

}
