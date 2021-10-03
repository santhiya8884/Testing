//Scenario #4:subclass2
public class TamilNadu extends SouthIndia{ 
static String capital="chennai";
	public TamilNadu(String primeMinister){
	super(primeMinister);
	}
public static void main(String[] args){ 
System.out.println(India5.capital);
System.out.println(TamilNadu.capital);
SouthIndia si=new TamilNadu("primeMinister");	
	si.speakLanguage();
	si.eat();
	si.dress();
	si.cultivate();
	si.livingStyle();
//	si.ownStyle();
}
	
void speakLanguage(){
	System.out.println("speak");
}
void eat(){
	System.out.println("eat");
}
void dress(){
	System.out.println("dress code");
}
void cultivate(){
	System.out.println("Rice and Sugar cane Cultivation");
}
void livingStyle(){ 
	System.out.println("Above Averge devlopment");
}
void ownStyle(){
	System.out.println("Own style");
}
}