package bank.icici.debit;

public class If_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		If_Demo sara1=new If_Demo();
    	sara1.ifelselearning();
		sara1.ifpractice();

	}

	public  void ifpractice() {
		// TODO Auto-generated method stub
		int day=6;//Assignment oprator
		String time="9oclock";
		if (day==4){//comparision operator
		
			if (time=="9oclock") {
				System.out.println("Go to temple");	
				
			}
			else { 
				System.out.println("Go to office");	
			}
		}
		else { 
			if (day==5){//comparision operator
				
				if (time=="9oclock") {
					System.out.println("Go to church");	
					
				}
				else { 
					System.out.println("Go to office");	
				}
			}
			else { 
				if (day==6){//comparision operator
					
					if (time=="9oclock") {
						System.out.println("Go to mosque");	
						
					}
					else { 
						System.out.println("Go to office");	
					}
				}
			} 
			
		}  
	}		
		

	public  void ifelselearning() {
		// TODO Auto-generated method stub
		int day=5;//Assignment oprator
		if (day==4){//comparision operator
		System.out.println("Go to temple");	
		}
		else{
		
			if (day==5) {
				System.out.println("Go to church");	
				
			}
			else {
				if (day==6) {
					System.out.println("Go to mosque");	
				}
				else {
					System.out.println("Back to Home");	
				}

			}
				
		}
		
	}

}
