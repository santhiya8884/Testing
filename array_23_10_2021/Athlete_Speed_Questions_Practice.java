package array_23_10_2021;

public class Athlete_Speed_Questions_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Athlete_Speed_Questions_Practice sara=new  Athlete_Speed_Questions_Practice();
		sara.first_Rank();
		sara.second_Rank();
		sara.last_Rank();
		sara.last_second_Rank();
		
	}
	public void last_second_Rank(){ 
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
		System.out.println("Last from second  Rank "+Second_player +" "+second+" speed time");
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
	public void last_Rank() {
		// TODO Auto-generated method stub
		String[] players = {"santhiya", "mano", "benson", "murali","sathish", "dhanraj"};  ///0,
		float[] time = {25.2f, 19.2f,23.6f, 28.4f, 16.5f, 30.3f,11};
		int first,second,sec_last,last;
		float max=Float.MIN_VALUE;
		int index=0;
		//System.out.println(min);
		
		for(int i=0;i<time.length;i++) { 
			if(time[i]>max) {//19-1,,,4,,,,6    /// value
				
				max=time[i];   //23.6   
				index=i;
			}
			
		}
		//System.out.println(index);//4    a[10],   a[0]=1      =str=pl[4;
		
		String First_player=players[index];

		System.out.println("Last Rank "+ First_player +" "+max+" speed time");
		
	}
	public void first_Rank() {
		// TODO Auto-generated method stub
		String[] players = {"santhiya", "mano", "benson", "murali","sathish", "dhanraj"};  ///0, index
		float[] time = {25.2f, 23.6f, 28.4f, 19.2f, 16.5f, 30.3f};
		int first,second,sec_last,last;
		float  min=Float.MAX_VALUE;//    Interger.min
		int index=0;
		//System.out.println(min);///////////////////////// 1 2 3 4 5 6 --5   int[] a={10,20,30,40,50,60};///0,9
		                         
		for(int i=0;i<time.length;i++) {   //i=3//4//5////  // a[1]=10;.      //Sys(a[4]);  //     int c=a[4];   int  b=50;
			if(time[i]<min) { //   19.2 <23.6    //----//16.5<19.2   //30.3<16.5 			 String  b=players[index];
				
				min=time[i];       //min=16.5
				index=i;   //4       //0,12,3445
			}
			
		}
		//System.out.println(index);//4    a[10],   a[0]=1      =str=pl[4;
		
		String First_player=players[index];

		System.out.println("First Rank "+ First_player +" "+min+ " 5" + "speed time");    // 16.5+"5"
		
	}
	
}
/* output :
 First Rank sathish 16.5 5speed time
Second  Rank mano 19.2 speed time
Last Rank dhanraj 30.3 speed time
Last from second  Rank murali 28.4 speed time
*/
