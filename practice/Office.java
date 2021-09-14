class Office{
	int price=50;
public static void main(String[] args){ 


Office officer=new Office();
officer.doService();
officer.giveSalary();	

}
	public void doService(){
	System.out.println("Providing Service");
	}
	private void giveSalary(){
	System.out.println("My salary");
	}
}