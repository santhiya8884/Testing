package array_25_10_2021;

import java.util.Scanner;

public class Liner_Search_Using_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Liner_Search_Using_Scanner sara=new Liner_Search_Using_Scanner();
		sara.linear_Search_Scanner();
	}
	public void linear_Search_Scanner() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length :");
		int length=sc.nextInt();
		int arr[]=new int[length];
		System.out.println("Enter the elements ");
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
			//int arr[]= {30,50,10,60,80};       //    key=10  30==10,50==10,10==10  ,,,index-0  arr[0]=0,arr[4]=80 O(n)
			//System.out.println(arr.length);
		//	int key=60;  //      length=5
			/*int i=0;
			while (i<arr.length) { //////0<5   
				if(arr[0]==key) {  //10==30
					System.out.println("found "+(i+1));
					break;
				}
				i++;
				
			}*/
		int i=0;
			for(;i<arr.length;i++) {
				if(arr[i]==key) {  //10==30
					System.out.println("found "+(i+1)+" position");
					break;
				}
			}
			 if(i>=arr.length) { 
				System.out.println("Number not found in the list");
			}
		
	}

}
/* output :
 *Enter the array length :
5
Enter the elements 
34
56
78
90
32
Array of elements :
34 56 78 90 32 
Enter the key value :
900
Number not found in the list
*/
