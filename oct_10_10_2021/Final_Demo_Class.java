package oct_10_10_2021;
final class Sample{ 
	void run() {
		System.out.println("cannot be acess");
	}
}

public class Final_Demo_Class extends Sample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_Demo_Class sara=new Final_Demo_Class();
		//sara.run();
	}

}
