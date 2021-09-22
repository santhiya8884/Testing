//this keyword pratice 2://this refers current class instance variable:

public class ManavanTestThis2{
	int m1,m2;
	String name;
	String classname;
	
	public ManavanTestThis2(int m1,int m2,String name,String classname){
	this.m1=m1;
	this.m2=m2;
	this.name=name;
	this.classname=classname;
		
	}
	
	
	
	public static void main(String[] args){ 
	ManavanTestThis2 stu1=new ManavanTestThis2(50,90,"ramesh","5th standard");
	ManavanTestThis2 stu2=new ManavanTestThis2(80,30,"suresh","6th standard");
	stu1.display();
	stu2.display();
	}
	void display(){ 
	System.out.println("Student details "+name+" "+classname+" "+ m1+" "+ m2);}
	
}