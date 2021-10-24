package array_23_10_2021;

import java.util.Scanner;

public class EB_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		EB_Bill sara=new EB_Bill();
		//sara.practiceEB();
		sara.practiceEB1();

	}

	public void practiceEB1() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of months :");
		int months=sc.nextInt();
		int total=0,amount,re;
		float average=0;
		int[] reading=new int[months];
		System.out.println("Enter the unit price :");
		int unit_price = sc.nextInt();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<reading.length;i++) { 
			System.out.println(" Enter the  month reading :");
			re=sc.nextInt();
			amount=re*unit_price;
			if(amount>max) { 
				max=amount;
				System.out.println(max);
			}
			total=total+amount;
			//System.out.println("total is "+total);
			average=total/months;
			//System.out.println("Average is "+total);
		}
		System.out.println("Maxium billl "+max);
		System.out.println("total is "+total);
		System.out.println("Average is "+average);
	}

	public void practiceEB() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of months :");
		int months=sc.nextInt();
		int total=0,amount,re;
		float average=0;
		int[] reading=new int[months];
		System.out.println("Enter the unit price :");
		int unit_price = sc.nextInt();
		for(int i=0;i<reading.length;i++) { 
			System.out.println(" Enter the  month reading :");
			re=sc.nextInt();
			amount=re*unit_price;
			total=total+amount;
			//System.out.println("total is "+total);
			average=total/months;
			//System.out.println("Average is "+total);
		}
		System.out.println("total is "+total);
		System.out.println("Average is "+average);
	}

}
/* output :
 Enter the no of months :
5
Enter the unit price :
4
 Enter the  month reading :
34
136
 Enter the  month reading :
56
224
 Enter the  month reading :
78
312
 Enter the  month reading :
32
 Enter the  month reading :
21
Maxium billl 312
total is 884
Average is 176.0
*/
