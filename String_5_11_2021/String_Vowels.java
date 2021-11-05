package string_5_11_2021;

public class String_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Vowels sara=new String_Vowels();
		sara.vowels_Count();
	}

	public void vowels_Count() {
		// TODO Auto-generated method stub
		//voels count
		String s=new String("santhiya lachu");
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++) { 
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') { 
			count++;
		}	
		}
		System.out.println("vowels count "+count);
		
	}

}
/* output :
vowels count 5
*/