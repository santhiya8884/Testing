//this keyword pratice 2://this invoke current class method implicitly:
class Test{
void attend(){
   System.out.println("Attending........");}
   void call(){
	this.attend();
   System.out.println("calling.............");}
	//this.attend();//----return type required.......*/

}


public class ManavanTestThis12{
	void attendtest(){
   System.out.println("Attending test........");}
   void callback(){
	this.attendtest();
   System.out.println("calling...back ..........");}
	
		public static void main(String[] args){ 
		ManavanTestThis12 obj1=new ManavanTestThis12();	
			obj1.callback();
		Test obj=new Test();
		obj.call();
			
	
	}
	
	
}