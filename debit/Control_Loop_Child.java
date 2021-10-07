package bank.icici.debit;

public class Control_Loop_Child extends Control_Looping_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control_Loop_Child sara=new Control_Loop_Child();
		sara.while1();
		System.out.println();
		System.out.println();
		sara.while2();
		System.out.println();
		System.out.println();
		sara.while3();
		System.out.println();
		System.out.println();
		sara.while4();
		System.out.println();
		System.out.println();
		sara.while5();
		System.out.println();
		System.out.println();
		
	}
	public  void while5() {
		// TODO Auto-generated method stub
		////Question : print----- 	2 6 12 20 30
		int i=0,no=2,j=4;
		while (i<5) {
			System.out.print(no+" ");
			no=no+j;
			j=j+2;
			i=i+1;
		}
		
	}

	public  void while4() {
		// TODO Auto-generated method stub
		////Question : print----- 25 20 15 10 5
		int i=0,no=25;
		while (i<5) {
			System.out.print(no+" ");
			no=no-5;
			i=i+1;
		}
		
	}

	public  void while3() {
		// TODO Auto-generated method stub
		////Question : print-----13 10 7 4 3 1
		int i=0,no=13;
		while (i<5) {
			System.out.print(no+" ");
			no=no-3;
			i=i+1;
		}
		
	}

	public  void while2() {
		// TODO Auto-generated method stub
		////Question : print-----5 10 15 20 25
		int i=0,no=5;
		while (i<5) {
			System.out.print(no+" ");
			no=no+5;
			i=i+1;
		}
		
	}

	public  void while1() {
		// TODO Auto-generated method stub
		////Question : print-----1 4 7 10 13
		int i=0,no=1;
		while (i<5) {
			System.out.print(no+" ");
			no=no+3;
			i=i+1;
		}
		
	}

}
