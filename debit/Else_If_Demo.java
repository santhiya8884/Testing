package bank.icici.debit;

public class Else_If_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Else_If_Demo sara=new  Else_If_Demo();
		sara.elseIfDemo1();
		sara.elseIfDemo2();

	}

	public void elseIfDemo2() {
		// TODO Auto-generated method stub
		String cus_choice="Night";
		if (cus_choice=="Morning") {
			System.out.println("Tea supplied");
		}
		else if (cus_choice=="Afternoon") {
			System.out.println("Cool supplied");
		}
		else if (cus_choice=="Night") {
			System.out.println("Milk supplied");
		}
		
	}

	public void elseIfDemo1() {
		// TODO Auto-generated method stub
		int day=1;
		if (day==1) {
			System.out.println("Go to Temple");
		}

		else if (day==2) {
			System.out.println("Go to chruch");
		}
		else if (day==3) {
			System.out.println("Go to mosque");
		}
		
	}

}
