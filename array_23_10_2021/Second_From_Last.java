package array_23_10_2021;

public class Second_From_Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second_From_Last sara=new Second_From_Last();
		sara.second_from_last_Rank();

	}
	public void second_from_last_Rank(){ 
		String[] players = {"santhiya", "mano", "benson", "murali","sathish", "dhanraj"};  ///0,
		float[] time = {25.2f,  19.2f,23.6f, 28.4f, 16.5f, 30.3f};
		
		float first=Float.MIN_VALUE;
		float second=Float.MIN_VALUE;
		int index=0,index1=0;
		for(int i=0;i<time.length;i++) { 
			if(time[i]>first) { 
				second=first;
				index1=index;
				first=time[i];   
				index=i;        
				
			}
			else if(time[i]>second&&time[i]!=first) {     
				second=time[i];
				index1=i;
			}
			
		}
				
		String First_player=players[index];
		String Second_player=players[index1];
		//System.out.println("First Rank "+ First_player +" "+first+" speed time");
		System.out.println("Second  Rank "+Second_player +" "+second+" speed time");
	} 

}
/* output :
 Second  Rank murali 28.4 speed time
*/
