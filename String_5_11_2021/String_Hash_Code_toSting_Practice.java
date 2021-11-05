package string_5_11_2021;
//toString() overriden :

public class String_Hash_Code_toSting_Practice {

	public String_Hash_Code_toSting_Practice(String string) {
		// TODO Auto-generated constructor stub
		
	}
	public String toString() { 
		return "ABC123";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("santhiya");
		System.out.println(s);
		System.out.println(s.hashCode());
		String_Hash_Code_toSting_Practice obj=new String_Hash_Code_toSting_Practice("Hai");
		System.out.println(obj);
		System.out.println(s);
	}

}
/* output :
 santhiya
2007774813
ABC123
santhiya
*/

