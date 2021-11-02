package string_01_11_2021;

public class Frequncy_Each_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frequncy_Each_Character sara=new Frequncy_Each_Character();
		sara.freqOfCharcter();

	}

	public void freqOfCharcter() {
		// TODO Auto-generated method stub
		String name="RANJAN BABU";
		char[] letters=new char[name.length()];
		int [] freq=new int[name.length()];
		//count of each character :
		
		for(int i=0;i<name.length();i++) { 
			//char ch=name.charAt(i);
			//letters[i]=ch;
			int count=0;
			for(int j=0;j<name.length();j++) { 
				if(name.charAt(i)==name.charAt(j)) { 
					count++;
			//		freq[i]=count;
				}	
				
			}
			//System.out.println(ch+" appers "+count+" Times");
			letters[i]=name.charAt(i);
			freq[i]=count;
			for(int j=i+1;j<name.length();j++) { 
				if(name.charAt(i)==name.charAt(j)) { 
					//count++;
					freq[i]=-5;
				}	
				
			}
			
		}
		
		for(int i=0;i<name.length();i++) { 
			
				 if(freq[i]>0) { 
					 System.out.println(letters[i]+" Appers "+freq[i]+" Times");
				 }
			
		}
		
	}

}
/* output :
R Appers 1 Times
J Appers 1 Times
N Appers 2 Times
  Appers 1 Times
A Appers 3 Times
B Appers 2 Times
U Appers 1 Times

*/
