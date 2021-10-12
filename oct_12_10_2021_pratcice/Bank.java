public  class Bank
{
	 static public void main(String[] args)
	 {
		 Bank cashier=new Bank();//object memory created using new keyword
		 cashier.deposit();
		 Bank customer=new Bank();
		 customer.deposit(500);  // int type of paramer passing
		// customer.deposit(sara);  // String typr of parameter passing
		 customer.deposit(500.5);  // float type of parameter passing
		 customer.deposit(500.5f);
		 customer.deposit(true);
	 }
	 void deposit()
	 {
		System.out.println("Deposit Success "); 
	
	}
	  void deposit(int money)
	 {
		System.out.println("Deposit Success "+(money+5)); 
	
	}
	 void deposit(double money)
	 {
		 System.out.println("Deposit Success " + money);
	 }
	 void deposit(boolean money)
	 {
		 System.out.println("Deposit Success " + money);
	 }
	 
	 
	 
	 
	 
	 
	 
 }
