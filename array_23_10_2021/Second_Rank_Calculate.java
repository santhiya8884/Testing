package array_23_10_2021;

public class Second_Rank_Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second_Rank_Calculate sara=new Second_Rank_Calculate();
		sara.second_Rank();
	}
	public void second_Rank() {
		// TODO Auto-generated method stub
		String[] players = {"santhiya", "mano", "benson", "murali","sathish", "dhanraj"};  ///0,
		float[] time = {25.2f,  19.2f,23.6f, 28.4f, 16.5f, 30.3f};
		
		float first=Float.MAX_VALUE;
		float second=Float.MAX_VALUE;
		int index=0,index1=0;
		for(int i=0;i<time.length;i++) { 
			if(time[i]<first) { //28<19
				second=first; //        s=25
				index1=index;
				first=time[i];  // 25        f=19
				index=i;         //4
				
			}
			else if(time[i]<second&&time[i]!=first) {   // 19<25     
				second=time[i];
				index1=i;
			}
			
		}
				
		String First_player=players[index];
		String Second_player=players[index1];
		//System.out.println("First Rank "+ First_player +" "+first+" speed time");
		System.out.println("Second  Rank "+ Second_player +" "+second+" speed time");
		
	}
}
/* 
 * Second  Rank mano 19.2 speed time
 */
