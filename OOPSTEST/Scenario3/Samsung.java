//Scenario #3:Subclass-2
public class Samsung extends FactoryDemo{ 
	static int price=5000;
 
public static void main(String[] args){
Samsung sam=new Samsung();
System.out.println(sam.price);
	sam.call(10);
	sam.receiveCall();
	sam.verifyFingerPrint();
	sam.providePattern();
}	
int call(int seconds){
	System.out.println("call back "+ seconds+" Seconds");
	return seconds;
}
void sendMessage(){
System.out.println("sendMessage");
}
void  receiveCall(){
System.out.println("receiveCall");
} 
void verifyFingerPrint(){
System.out.println("Fingerprint");
}
void providePattern(){
System.out.println("Pattern");
}
}