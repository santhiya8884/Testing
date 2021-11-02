package string_01_11_2021;

public class Sec_Max_Num_Of_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sec_Max_Num_Of_Char sara=new Sec_Max_Num_Of_Char();
		sara.secMaxNUmberOfOccuringCharacter();
	}
	public void secMaxNUmberOfOccuringCharacter() {
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
			
				 if(freq[i]>0 && letters[i]!=' ') { 
					// System.out.println(letters[i]+" Appers "+freq[i]+" Times");
				 }
			
		}
	
		int max=Integer.MIN_VALUE;
		int index=0;
		int index1=0;
		int sec_max=Integer.MIN_VALUE;
		for(int i=0;i<freq.length;i++) { 
			//System.out.println(freq[i]);
			if(freq[i]>max) {
				sec_max=max;
				index1=index;
				max=freq[i];
				index=i;
			}
			else if(freq[i]>sec_max && freq[i]!=max) { 
				
				index1=freq[i];
			}
		}
		//System.out.println();
		
				System.out.println(letters[index1]+"  Char Large number of times occures "+freq[index1]);
		
}
}
/* output :
 N  Char Large number of times occures 2

*/
