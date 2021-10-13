package oct_13;

public class Reverse_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_of_Number sara=new Reverse_of_Number();
		sara.reverseOfNumber();
	}

	public void reverseOfNumber() {
		// TODO Auto-generated method stub
		//12345/////i/p
		//54321-->o/p
		//853062147------>12345     853%10==3 ,  853/10=85.3   , 85%10=5   
		int n=903,rem,rev=0,n1=n;    // %----rem   /---quie   
		//int n1=5;
		/*while (n1>=1) {
			System.out.print(n1);//5// 4/3/2/1
			n1=n1-1;
		}*/
		while (n>0) {///1000>0//100>0 10>0 1>0 0>0

			rem=n%10;   ///1000%10 //100%10//0 1%10--1---//3   8%10
			//System.out.print(rem);
			rev=(rev*10)+rem;//0 0 0 1
			n=n/10;///1000/10 //10 1 1/10 --0    853/10---85   8/10
		}
		System.out.print("the reverse of the number "+n1+" -->"+rev);
		//n=853
		
		//rem=n%10    853%10=3
		//s.o.p(rem)//3
		//n=n/10-------------853/10------85
		
		
		//rem=n%10-------------------5
		//s.o.p(rem)//---5//////////0
		//n=n/10////--------853/10--------->85
		
		
		//rem=n%10-------8%10/////////////----8    
		//s.o.p(rem)//---8
		//n=n/10////--------8/10---------
		
		
		
		
		
		
		
		
		/*System.out.print(n1);
		n1=n1-1;
		System.out.print(n1);
		n1=n1-1;
		System.out.print(n1);
		n1=n1-1;
		System.out.print(n1);
		n1=n1-1;
		System.out.print(n1);
		n1=n1-1;*/
		
	}

}
