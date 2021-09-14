class Bank2
{
	
	
	static int bankbalance=100;
	//int balance=50;
	int balance;
	//public void main(String[] args)
	public static void main(String[] args)
	{
		//int balance=50;
		
		Bank2 customer1=new Bank2();
		Bank2 customer2=new Bank2();
		customer2.balance=700;
		customer1.deposit(1000);//Method calling statement
		System.out.println(Bank2.bankbalance);// class specfic information
		System.out.println(customer1.balance);// object specfic information
		//System.out.println(Bank2.balance);
		//System.out.println(balance);
		System.out.println(customer2.balance);
		
		
			
	}
	void deposit(int money)
	{
		System.out.println("Deposit success"+ money);
	}

	
	
	
	
}