package array_25_10_2021;


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
		System.out.println("enter the nuber months :");
		int month=sc.nextInt();
		int[] amount=new int[month];
		System.out.println("enter the amountt: ");
		for(int i=0;i<amount.length;i++) { 
			amount[i]=sc.nextInt();
		}
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,tot=0;
		float avg;
		for(int i=0;i<amount.length;i++) { 
			//System.out.print(amount[i]+" ");
			tot=tot+amount[i];
			
			if(amount[i]<min) {
				min=amount[i];
			}
			if(amount[i]>max) { 
				max=amount[i];
			}
		}
		avg=tot/amount.length;
		System.out.println("total  EB "+tot);
		System.out.println("Averge "+avg);
		
		System.out.println("Highest amount "+max);
		System.out.println("Lowest amount "+min);
		
	}
	public void practiceEB() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of months :");
		int months=sc.nextInt();
		int total=0,amount,re;
		float average=0;
		int[] reading=new int[months];
		int[] amountcal=new int[months];
		System.out.println("Enter the unit price :");
		int unit_price = sc.nextInt();
		for(int i=0;i<reading.length;i++) { 
			System.out.println(" Enter the  month reading :");
			re=sc.nextInt();
			amount=re*unit_price;
			amountcal[i]=sc.nextInt();
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


/*
 enter the nuber months :
5
enter the amountt: 
1
2
3
4
5
total 15
Averge 3.0
Highest amount 5
Lowest amount 1
*/
