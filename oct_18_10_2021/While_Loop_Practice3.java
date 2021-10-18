package oct_18_10_2021;

import java.util.Iterator;

public class While_Loop_Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		While_Loop_Practice3 sara=new While_Loop_Practice3();
		sara.loop();

	}

	public void loop() {
		// TODO Auto-generated method stub
		for(int row=1;row<5;row++) { 
			for(int col=1;col<=5;col++) { 
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
