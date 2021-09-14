class Student{
	int m1,m2,m3,l1,l2,l3,m4,m5,m6;
	String dept;
	
	Student(String dept,int m1,int m2,int m3,int l1,int l2,int l3){
		if(dept=="CSE")
		{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.l1=l1;
		this.l2=l2;
		this.l3=l3;
		}
		else if(dept=="BIO"){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.l1=l1;
		this.l2=l2;
		this.l3=l3;
		}
		else if(dept=="ACC"){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=l1;
		this.m5=l2;
		this.l1=l3;
		}
		else if(dept=="HIS"){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=l1;
		this.m5=l2;
		this.m6=l3;
		}
			
	}
	
	/*Student(int m1,int m2,int m3,int m4,int m5,int m6,int l1){
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	this.m4=m4;
	this.m5=m5;
	this.m6=m6;
	}*/
	public static void main(String[] args)
	{
	Student csestu=new Student("CSE",10,20,30,40,50,60);//m1,m2,m3,l1,l2,l3
	Student biostu=new Student("BIO",70,80,90,77,89,65);//m1,m2,m3,l1,l2,l3
	Student accstu=new Student("ACC",22,33,44,55,66,77);//m1,m2,m3,m4,m5,l1
	Student hisstu=new Student("HIS",99,98,97,96,95,94);//m1,m2,m3,m4,m5,m6
	System.out.println(csestu.dept);
	csestu.csemarks();
	biostu.biomarks();
	accstu.accmarks();
	hisstu.hismarks();
	}
	void csemarks(){
	System.out.println("            CSE STUDENTS MARKS :");
	System.out.println("cse student m1 marks "+m1);
	System.out.println("cse student m2 marks "+m2);
	System.out.println("cse student m3 marks "+m3);
	System.out.println("cse student l1 marks "+l1);
	System.out.println("cse student l2 marks "+l2);
	System.out.println("cse student l3 marks "+l3);}
	
	void biomarks(){
	System.out.println("            BIO STUDENTS MARKS :");
	System.out.println("biology student m1 marks "+m1)  ;
	System.out.println("biology student m2 marks"+m2);
	System.out.println("biology student m3 marks "+m3);
	System.out.println("biology student m4 marks "+l1);
	System.out.println("biology student m5 marks "+l2);
	System.out.println("biology student m6 marks "+l3);}
	void accmarks(){
	System.out.println("            ACC STUDENTS MARKS :");
	System.out.println("Account student m1 marks "+m1);
	System.out.println("Account student m2 marks "+m2);
	System.out.println("Account student m3 marks "+m3);
	System.out.println("Account student m4 marks "+m4);
	System.out.println("Account student m5 marks "+m5);
	System.out.println("Account student m6 marks "+l1);}
	
	void hismarks(){
	System.out.println("            HIS STUDENTS MARKS :");
	System.out.println("History student m1 marks "+m1);
	System.out.println("History student m2 marks "+m2);
	System.out.println("History student m3 marks "+m3);
	System.out.println("History student m4 marks "+m4);
	System.out.println("History student m5 marks "+m5);
	System.out.println("History student m6 marks "+m6);}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}