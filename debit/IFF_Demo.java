package bank.icici.debit;

public class IFF_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFF_Demo sara=new  IFF_Demo();
		sara.IfDemo1();
		sara.IfDemo2();

	}

	public void IfDemo2() {
		// TODO Auto-generated method stub
		String day="tuesday";
		if(day=="WED") {
		System.out.println("Go to temple");
	}
	}
	public void IfDemo1() {
		// TODO Auto-generated method stub
		int age=20;
		if (age>=18) {
			System.out.println("Access permission to aplly voter id");
		}
		
	}

}

//Output :
//Access permission to aplly voter id
