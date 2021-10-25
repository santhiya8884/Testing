package array_25_10_2021;

import java.util.Scanner;

public class Binary_Search_Using_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Search_Using_Scanner sara=new Binary_Search_Using_Scanner();
		sara.bin_Scanner();
	}
	public void bin_Scanner() {
		// TODO Auto-generated method stub
		//int arr[]= {10,20,30,40,50}; //start+end/2     5,,  1-12-3-4-5,,,  0,1234   len-1  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length :");
		int length=sc.nextInt();
		int arr[]= new int[length];
		System.out.println("Enter the elements  in ascending order:");
		for(int i=0;i<arr.length;i++) { 
			arr[i]=sc.nextInt();
		}
		System.out.println("Array of elements :");
		for(int i=0;i<arr.length;i++) { 
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the key value :");
		int key=sc.nextInt();
		int start=0,end=arr.length-1,mid;//0,3
		
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
			System.out.println(" I got this NUmber "+" in  a position "+(mid+1));
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
 Enter the array length :
5
Enter the elements  in ascending order:
12
34
56
78
90
Array of elements :
12 34 56 78 90 
Enter the key value :
800
NO number in a list
*/
