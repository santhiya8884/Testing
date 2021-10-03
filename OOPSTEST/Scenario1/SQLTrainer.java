//Scenario #1:
//Subclass

public class SQLTrainer extends  Trainer{ 
/*public SQLTrainer(String dept,String institute){  
super(dept,institute);
	this.dept=dept;
	this.institute=institute;
}*/	
	
	
	
public static void main(String[] args){  
 SQLTrainer ram1=new SQLTrainer();
// SQLTrainer ram=new SQLTrainer("java","payilagam");
// Trainer trainerkumar=new SQLTrainer("CSE","payilagam");
//System.out.println(trainerkumar.dept);
//System.out.println(trainerkumar.institute);
 ram1.training();
// ram.getSalary();
}
}

