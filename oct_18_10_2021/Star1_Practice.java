package oct_18_10_2021;

public class Star1_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star1_Practice sara= new Star1_Practice();
		sara.star1();

	}

	public void star1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++) { 
			for(int col=5;col>=row;col--) { 
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}
