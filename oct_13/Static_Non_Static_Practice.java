package oct_13;

public class Static_Non_Static_Practice {
	//soft-suave
	static int a=10;
	int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Non_Static_Practice sara=new Static_Non_Static_Practice();
		sara.a=50;
		sara.b=80;
		Static_Non_Static_Practice thiya=new Static_Non_Static_Practice();
		System.out.println("sara "+sara.a+" "+sara.b);
		System.out.println("thiya "+thiya.a+" "+thiya.b);
	}

}
