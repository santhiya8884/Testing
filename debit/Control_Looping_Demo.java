package bank.icici.debit;

public class Control_Looping_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Control_Looping_Demo sara=new Control_Looping_Demo();
		sara.doWhileLoopDemo();
		sara.whileLoopDemo();
		sara.forLoopDemo();
		
	}

	public void whileLoopDemo() {
		int days = 1;
		// TODO Auto-generated method stub
		while (days<=7) {
			System.out.println("Good morning lachu");
			days=days+1;
		}
		
	}

	public void forLoopDemo() {
		// TODO Auto-generated method stub
		
	}

	public void doWhileLoopDemo() {
		int days = 1;
		// TODO Auto-generated method stub
		//say good morning to my mom in one weeek or 7 days
		do {
			System.out.println("Good morning mom");
			days=days+1;
		} while (days<=7);
		
		
	}

}

