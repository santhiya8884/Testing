package string_01_11_2021;

public class Maximun_Number_Of_Times_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maximun_Number_Of_Times_Char sara=new Maximun_Number_Of_Times_Char();
		sara.maxNUmberOfOccuringCharacter();
	}
	public void maxNUmberOfOccuringCharacter() {
		// TODO Auto-generated method stub
		String name="RANJAN BABU";
		int index=0;
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
		for(int i=0;i<freq.length;i++) { 
			//System.out.println(freq[i]);
			if(max<freq[i]) { 
				max=freq[i];
				index=i;
			}
		}
		//System.out.println();
		System.out.println(letters[index]+"  Char Large number of times occures "+freq[index]);

} 
}
/* output :
 A  Char Large number of times occures 3
 */
