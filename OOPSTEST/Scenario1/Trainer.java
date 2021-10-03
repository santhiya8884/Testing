//Scenario #1:
//Super class
public class Trainer{ 
String dept;
String institute;
private int salary=10000;
public  Trainer(String dept,String institute){
this.dept=dept;
this.institute=institute;
	
}

public int getSalary(){
	System.out.println(this.salary);
	return this.salary;
}

public static void main(String[] args){ 
Trainer trainerkumar=new Trainer("CSE","payilagam");
}
void training(){
	
System.out.println("welcome");
}
	
}