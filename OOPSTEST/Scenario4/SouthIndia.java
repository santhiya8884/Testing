//Scenario #4:subclass1
abstract class SouthIndia extends India5{
	public SouthIndia(String primeMinister){ 
	super(primeMinister);
	//System.out.println("primeMinister "+primeMinister);
	}
	abstract void cultivate();/*{
		System.out.println("Rice and Wheat Cultivation");
	}*/
	void livingStyle(){ 
		System.out.println("Averge devlopment");
	}
}