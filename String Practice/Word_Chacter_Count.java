package string_29_10_2021;

public class Word_Chacter_Count {

	public static void main(String[] args) {
		Word_Chacter_Count sara=new Word_Chacter_Count();
		//sara.wordChacCount();
		//sara.stringPalindrome();
		//sara.stringToInteger();
		//sara.stringReverse();
	}

	public void stringToInteger() {
		// TODO Auto-generated method stub
		String s="123";/////
		System.out.println(s+5);
		int var
		Integer a
		int a=Integer.parseInt(s);
		int b=s.
	}

	public void stringPalindrome() {
		// TODO Auto-generated method stub
	/*	String s="madam";     // amma,appa,   m  a  d  s   m     amma  
		String s1;
		int i=0, j=s.length()-1;
		boolean palin_flag=true;
		while(i<j) {   // m a l a y a l a m  
			if(s.charAt(i)!=s.charAt(j)) { //m , m
				palin_flag=false;
			
				break;
				
			}
			i++;
			j--;
		}
		if(palin_flag==true) { 
			System.out.println("Yes");
		}
		else { 
			System.out.println("no");
		}
	/*   i=0, j=s.length()-1
	 * 	s[0]=s[4];
		s[1]=s[3];
		s[2]=s[2]; 
		*/
		/* 123 ==321
		
		121==121
		151=151*/
		//terney  if(condition)?a:b
		int a=10,b=20;
	int c=	(a>b)?(a+b):(a-b);
		System.out.println(c);
		
		
	}

	public void wordChacCount() {
		// TODO Auto-generated method stub
		int w_c=0,c_c=0;
		String s="sara santhiya";
		
		int i=s.length()-1;
		while(i>=0) {
			if(s.charAt(i)==' ')  { 
				w_c++;
				
				}
			System.out.println("word count "+w_c);
		System.out.println("word count "+c_c);
	}
	}
	
	}
