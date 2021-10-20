package number_right_pattern_20_10_2021;

public class Right_Number_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Right_Number_Pattern sara=new  Right_Number_Pattern();
		sara.rightPattern();
		System.out.println();
		sara.rightPattern1();
		System.out.println();
		sara.rightPattern2();
		System.out.println();

	}

	public void rightPattern2() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++){ 
	    	for(int col=1;col<row;col++){ 
	    	    System.out.print(" "+" ");
	    	}
	    	for(int col=5;col>=row;col--){ 
	    	    System.out.print("*"+" ");
	    	}
	    	System.out.println();
	}
	}

	public void rightPattern1() {
		// TODO Auto-generated method stub
		for(int row=1;row<=5;row++){ 
	    	/*for(int col=1;col<=row;col++){ 
	    	    System.out.print(col+" ");
	    	}*/
	    	for(int col=1;col<=row;col++){ 
	    	    System.out.print(" "+" ");
	    	}
	    	/*for(int col=1;col<=4;col++){ 
	    	    System.out.print("*"+" ");
	    	}*/
	    	/*for(int col=5;col>=row;col--){ 
	    	    System.out.print("*"+" ");
	    	}*/
	    	for(int col=5;col>=row;col--){ 
	    	    System.out.print("*"+"  ");
	    	}
	    	System.out.println();
	}
	}

	public void rightPattern() {
		// TODO Auto-generated method stub
	/*	for(int row=5;row>=1;row--){ 
	    	for(int col=1;col<row;col++){ 
	    	    System.out.print(col+" ");
	    	}*/
		for(int row=5;row>=1;row--){ 
	    	for(int col=1;col<row;col++){ 
	    	    System.out.print(" "+" ");
	    	}
	    /*for(int k=1;k<=5;k++){
	        	System.out.print("*"+" ");
	    }*/
	    /*for(int k=5;k>=row;k--){
	        	System.out.print("*"+" ");
	    }*/
	    	/*for(int k=1;k<=6-row;k++){
	        	System.out.print("*"+" ");
	    }*/
	    	/*for(int k=5;k>=row;k--){
	        	System.out.print(row+" ");
	    }*/
	    	/*for(int col=5;col>=row;col--){
	        	System.out.print(col+" ");
	    }*/
	    /*	for(int k=1;k<=6-row;k++){
	        	System.out.print(k+" ");
	    }*/
	    	/*for(int k=1;k<=6-row;k++){
	        	System.out.print(k+"  ");
	    }*/
	    for(int k=1;k<=6-row;k++){
	        	System.out.print("*"+"  ");
	    }
	    	System.out.println();
	}
	/*for(int row=1;row<=5;row++){ 
	    	for(int col=1;col<=row;col++){ 
	    	    System.out.print(col+" ");
	    	}
	    	System.out.println();
	}*/
	}

}
/* 
 
         *  
      *  *  
    *  *  *  
  *  *  *  *  
*  *  *  *  *  

  *  *  *  *  *  
    *  *  *  *  
      *  *  *  
        *  *  
          *  

* * * * * 
  * * * * 
    * * * 
      * * 
        * 
 
 */
