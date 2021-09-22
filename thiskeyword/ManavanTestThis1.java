//this keyword pratice 2://this refers current class instance variable:

public class ManavanTestThis1{
	int m1,m2;
	String name;
	String classname;
	
	public ManavanTestThis1(int m1,int m2,String name,String classname){
	m1=m1;
	m2=m2;
	name=name;
	classname=classname;
		
	}
	
	
	
	public static void main(String[] args){ 
	ManavanTestThis1 stu1=new ManavanTestThis1(50,90,"ramesh","5th standard");
	ManavanTestThis1 stu2=new ManavanTestThis1(80,30,"suresh","6th standard");
	stu1.display();
	stu2.display();
	}
	void display(){ 
	System.out.println("Student details "+name+" "+classname+" "+ m1+" "+ m2);}
	
}