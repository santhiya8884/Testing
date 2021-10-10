package oct_10_10_2021;
class Test{ 
	 final void testMethod() { 
		System.out.println("Final method cannot be chaged..");
	}
	static  final void testMethod1() { 
			System.out.println("static Final method cannot be chaged..");
		}
}

public class Sample_final_Method  extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample_final_Method sara=new Sample_final_Method();
		sara.testMethod1();
		sara.testMethod();

	}
	  void testMethod() { 
		System.out.println("Final method can be chaged..");
	}
	static  void testMethod1() { 
			System.out.println("static Final method can be chaged..");
		}

}
//output : compile time error
