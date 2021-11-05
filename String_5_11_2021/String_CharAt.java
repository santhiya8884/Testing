package string_5_11_2021;

public class String_CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_CharAt sara=new String_CharAt();
		sara.methodcharAt();
		System.out.println("\n");
		sara.methodcharAtCharCount();
		System.out.println("\n");
		sara.methodLengthOfString();
		System.out.println("\n");

	}

	public void methodLengthOfString() {
		// TODO Auto-generated method stub
		String s=new String("santhiya lachu");
		System.out.println("Length of a string "+s.length());
	}

	public void methodcharAtCharCount() {
		// TODO Auto-generated method stub
		// a  - count only defined..........
		String s=new String("santhiya lachu");
		int count=0;
		for(int i=0;i<s.length();i++) { 
		if(s.charAt(i)=='a') { 
			count++;
		}	
		}
		System.out.println("a letter "+count+" times present");
	}

	public void methodcharAt() {
		// TODO Auto-generated method stub
		String s=new String("santhiya lachu");
		for(int i=0;i<s.length();i++) { 
		System.out.println(s.charAt(i));	
		}
		
		
		
		/*System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(5));*/
	}

}
/* output :
 s
a
n
t
h
i
y
a
 
l
a
c
h
u


a letter 3 times present


Length of a string 14

*/
