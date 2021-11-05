package string_5_11_2021;

public class String_Overrides_toString_Static_Variables {
	String name;
	int age;
	public String_Overrides_toString_Static_Variables(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public String_Overrides_toString_Static_Variables(String string, int i) {
		// TODO Auto-generated constructor stub
		this.name=string;
		this.age=i;
	}
	public String toString() { 
		return "name "+	this.name+" age "+this.age;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("santhiya");
		System.out.println(s);
		System.out.println(s.hashCode());
		String_Overrides_toString_Static_Variables obj=new String_Overrides_toString_Static_Variables("sara");
		String_Overrides_toString_Static_Variables obj1=new String_Overrides_toString_Static_Variables("ammu");
		String_Overrides_toString_Static_Variables obj2=new String_Overrides_toString_Static_Variables("lachu");
		String_Overrides_toString_Static_Variables obj3=new String_Overrides_toString_Static_Variables("lachu",35);
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
	
	}

}
/* output :
 santhiya
2007774813
name sara age 0
name ammu age 0
name lachu age 0
name lachu age 35
*/
