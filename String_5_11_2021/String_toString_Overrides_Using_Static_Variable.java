package string_5_11_2021;

public class String_toString_Overrides_Using_Static_Variable {

	public String_toString_Overrides_Using_Static_Variable(String string) {
		// TODO Auto-generated constructor stub
	}
	public String toString() { 
		 return  "sara";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("santhiya");
		System.out.println(s);
		System.out.println(s.hashCode());
		String_toString_Overrides_Using_Static_Variable obj=new String_toString_Overrides_Using_Static_Variable("sara");
		String_toString_Overrides_Using_Static_Variable obj1=new String_toString_Overrides_Using_Static_Variable("ammu");
		String_toString_Overrides_Using_Static_Variable obj2=new String_toString_Overrides_Using_Static_Variable("lachu");
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(s);
	}

}
