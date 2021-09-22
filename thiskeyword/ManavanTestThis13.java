//this keyword pratice 2://this invoke current class constructor:
class Test{
Test(){
		this("hai sara");
	System.out.println("Welcome to our Home");
}
	Test(String message){ 

	System.out.println(message);
	}

}

/*public class  ManavanTestThis13{
	ManavanTestThis13 (){
	System.out.println("Welcome yo student home");}
	public static void main(String[] args){ 
		 //ManavanTestThis13 obj1=new  ManavanTestThis13();	
			Test obj=new Test("Hai sara");
		
	}
	*/



public class  ManavanTestThis13{
	ManavanTestThis13 (){
	System.out.println("Welcome yo student home");}
	public static void main(String[] args){ 
		 //ManavanTestThis13 obj1=new  ManavanTestThis13();	
			Test obj=new Test();
		
	}

}