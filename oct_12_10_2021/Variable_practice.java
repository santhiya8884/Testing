package oct_12_10_2021;

public class Variable_practice {
	static int value=100; //static
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//System.out.println(a);	//---Error
		int c=70;      //local //instance
		System.out.println("Static "+value);	
		Variable_practice sara=new Variable_practice();
		System.out.println("instance "+c);	
		sara.add();
	}
	//System.out.println(c);	
		

	void add() { //method
		int a=5,b=10;//local
		System.out.println("static "+value);
		System.out.println("local "+(a+b));	
	}
	
	//System.out.println(a);	//Error

}
