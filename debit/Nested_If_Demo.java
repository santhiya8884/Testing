package bank.icici.debit;

public class Nested_If_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested_If_Demo sara=new  Nested_If_Demo();
		sara.nestedIfDemo1();
		sara.nestedIfDemo2();


	}

	public  void nestedIfDemo2() {
		// TODO Auto-generated method stub
		String tech="IT";
		int year=2016;
		if (tech=="IT") {
			if (year==2019) {
				System.out.println("Elible for the attend interview");
			}
			else {
				System.out.println(" NOT Elible for the attend interview");
			}
			
		}
		else {
			System.out.println(" NOT Elible for the attend interview");
		}
	}
	

	public void nestedIfDemo1() {
		// TODO Auto-generated method stub
		
	}

}
