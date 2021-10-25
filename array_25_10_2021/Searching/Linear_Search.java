package array_25_10_2021;

import java.util.Scanner;

public class Linear_Search {
	public static void main(String[] args) {
		Linear_Search sara=new Linear_Search();
		sara.linear();
		}
	public void linear() {
		// TODO Auto-generated method stub
		int arr[]= {30,50,10,60,80};       //    key=10  30==10,50==10,10==10  ,,,index-0  arr[0]=0,arr[4]=80 O(n)
		//System.out.println(arr.length);
		int key=60;  //      length=5
		/*int i=0;
		while (i<arr.length) { //////0<5   
			if(arr[0]==key) {  //10==30
				System.out.println("found "+(i+1));
				break;
			}
			i++;
			
		}*/
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {  //10==30
				System.out.println("found "+(i+1));
				break;
			}
		}
	}

}
/*  output :
 found 4
 */
