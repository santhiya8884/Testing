public abstract class College{
	
	public static void main(String[] args){
	
	/*College obj=new College();
	/*obj.provideDegreeCertificate();
	obj.accessGround();*/
		System.out.println("Abstract");
		//College.accessGround();
	}
	
	public  abstract void provideDegreeCertificate();
	

	public   void accessGround(){
	System.out.println("Access granted...");
	}
	
	
}