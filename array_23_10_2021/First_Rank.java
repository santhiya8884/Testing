package array_23_10_2021;

public class First_Rank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First_Rank sara=new First_Rank();
		sara.first_Rank();
		
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

		System.out.println("First Rank "+ First_player +" "+min+ "speed time");    // 16.5+"5"
		
	}

}
/* output :
 First Rank sathish 16.5speed time
*/
