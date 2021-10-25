package array_25_10_2021;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Search sara=new Binary_Search();
		sara.bin();
		

	}
		public void bin() {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50}; //start+end/2     5,,  1-12-3-4-5,,,  0,1234   len-1  
		int start=0,end=arr.length-1,mid;//0,3
		int key=40;
		int i=0;
	while (start<=end) // 1< 5 //2<5 //3<5 //4<5//5<5    0<5,    5<0       
	{ 
		mid=(start+end)/2;    //2
		/*if(arr[i]==key) ////10==50   //20==50 // 30==50  //40==50 //50==50
		{
			System.out.println(" I got this NUmber "+(i+1));
		}
		i++;*/
		if(arr[mid]==key) //30==50   ///10 20 40 50 60 30=30 =50
		{
			System.out.println(" I got this NUmber "+(mid+1));
			break;
		}
		else if(key<arr[mid]) {  //30<50 40<50   50<30
			end=mid-1;
			
		}
		else if(key>arr[mid]) { 
			start=mid+1;
		}
		
		i++;
		
	}
	if(start>end) { 
		System.out.println("NO number in a list");
	}
	}

}


/* output :
  I got this NUmber 4

 */
