package oct_17_10_2021;

public class Object_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object_Example1 sara=new Object_Example1();
		Object_Example1 zara=new Object_Example1();
		System.out.println(sara);
		System.out.println(zara);
		System.out.println(sara.hashCode());//int-Oject
		System.out.println(zara.hashCode());//int-Oject
		System.out.println(sara.equals(zara));
		//System.out.println(zara.hashCode());
	}
	public int hashCode() {
		return 88888; 
		
	}

}
