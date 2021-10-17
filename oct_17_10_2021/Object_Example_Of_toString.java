package oct_17_10_2021;

public class Object_Example_Of_toString {
	int age;
	String current_place,native_place,senior;
	public Object_Example_Of_toString(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
		this.age=i;
		this.current_place=string;
		this.native_place=string2;
	}
	public Object_Example_Of_toString(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		this.age=i;
		this.current_place=string;
		this.native_place=string2;
		this.senior=string3;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object_Example_Of_toString sara=new Object_Example_Of_toString(24,"chennai","ariyalur","ram");
		Object_Example_Of_toString zara=new Object_Example_Of_toString(24,"porur","ariyalur");
		//hash value print the objects://internally called toSti
		System.out.println(sara);   //compiler writes the s1.toString() internally
		System.out.println(zara); //compiler writes the s1.toString() internally
		//i want object specific information like age native place current place also...
		
	}
		
		public String toString() {  //overriding the  toString() method 
			return  age+" "+current_place+" "+native_place+" "+senior; 
			
		}
}
/* output :
 24 chennai ariyalur ram
24 porur ariyalur null
*/
