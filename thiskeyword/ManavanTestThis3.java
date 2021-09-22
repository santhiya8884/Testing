//this keyword pratice 2://this refers current class instance variable:

public class ManavanTestThis3{
	int m1,m2;
	String name;
	String classname;
	
	public ManavanTestThis3(int mark1,int mark2,String stuname,String classnamedetail){
	m1=mark1;
	m2=mark2;
	name=stuname;
	classname=classnamedetail;
		
	}
	
	
	
	public static void main(String[] args){ 
	ManavanTestThis3 stu1=new ManavanTestThis3(50,90,"ramesh","5th standard");
	ManavanTestThis3 stu2=new ManavanTestThis3(80,30,"suresh","6th standard");
	stu1.display();
	stu2.display();
	}
	void display(){ 
	System.out.println("Student details "+name+" "+classname+" "+ m1+" "+ m2);}
	
}