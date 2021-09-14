class School{ 										//Class name School
	 String name;									//NOn static variable
	 int rollno;									//NOn static variable
	
	 School(  String name, int rollno){				//Automatically constructor calling 
		name=name;								//confusion of the of the 
		rollno=rollno;
		/*this.name=name;								//Initializing  current object specific values
		this.rollno=rollno;*/
		
	//System.out.println("hai");
	}

	/*void School123(String name, int rollno){		//exapmle of constrctor
	System.out.println("hai");
	}*/
	public  static void  main(String[] args){ 		//Main method
	
	//School student=new School();
	School student1=new School("santhiya",123);		//Create an object with parameter
	School student2=new School("sara",124);		    //Create an object with parameter
		/*School student3=new School();
		student3.name="balu";*/
	/*student.name="santhiya";
	student.rollno=123;*/
										
	//student3.School();	
	student1.study();
	student2.play();
	
	
	
	}			
	void study(){ 							//non static
	System.out.println(name);				//constructor info not take this line-only global default value assinged
	System.out.println(rollno);				//constructor info not take this line-only global default value assinged
	System.out.println("study well");
		
	}
	void play(){ 
	System.out.println(name);								
	System.out.println(rollno);
	System.out.println(" play well");
	
	}
	
	/*void School(){
		System.out.println("   read          well");
	}*/
}