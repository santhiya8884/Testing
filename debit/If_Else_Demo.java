package bank.icici.debit;

public class If_Else_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		If_Else_Demo sara=new  If_Else_Demo();
		sara.IfelseDemo1();
		sara.IfelseDemo2();

	}

	public void IfelseDemo2() {
		// TODO Auto-generated method stub
		String day="tuesday";
		if(day=="WED") {
		System.out.println("Go to temple");
	}
	}

	public
	void IfelseDemo1() {
		// TODO Auto-generated method stub
		int age=6;
		if (age>=18) {
			System.out.println("Access permission to apply voter id");
		}
		else {
			System.out.println("Your age is below 18 no permisiion to apply voter id");
		}
		
	}

}



//output:Your age is below 18 no permisiion to apply voter id
