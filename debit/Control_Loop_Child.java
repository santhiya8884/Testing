package bank.icici.debit;

public class Control_Loop_Child extends Control_Looping_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control_Loop_Child sara=new Control_Loop_Child();
		sara.while1();
		
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
