package array_25_10_2021;

import java.util.Scanner;

public class Sum_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum_Of_Array sara=new Sum_Of_Array();
		sara.sum_Of_Array_Elements();
	}

	public void sum_Of_Array_Elements() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array :");
		int length=sc.nextInt();
		int arr[]=new int[length];
		int sum=0;
		System.out.println("Enter the array elements :");
		for(int i=0;i<arr.length;i++) { 
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println(" array elements  are :");
		for(int i=0;i<arr.length;i++) { 
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("The sum is "+sum);
		
	}

}
/* output :
 Enter the length of an array :
4
Enter the array elements :
23
45
67
89
 array elements  are :
23 45 67 89 
The sum is 224
*/
