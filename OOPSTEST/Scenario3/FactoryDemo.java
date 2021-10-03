//Scenario #3:Subclass-1
abstract class  FactoryDemo extends Smartphone{
	boolean isOriginalPiece=false;
	static int price=0;
abstract void verifyFingerPrint();
abstract void providePattern();
void browse(){ 
System.out.println("Factory Demo browsing");
}
} 