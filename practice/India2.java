class India2{ 							//Class name India
	static String capital="Delhi";		//Global static variable
	static String primeminister;		//3-8 all variables are non-static	
	static String chiefminister;
	static String educational minister;
	static String Healthminister;
	static String District;
	static String State;
String citizenname;						//Global non static variable
int age;								//Global non static variable
float height;							//Global non static variable
boolean nri;							//Global non static variable
String mother_name;						//Global non static variable
char First;								//Global non static variable



public static void main(String[] args){ //Main method
India2 citizen=new India();				//Create an object
	int abc=0;							//reate an local variable
	System.out.println(abc);			//print statement
	
	citizen.citizenname="sara";			//Initialize  the  global object specific(instance specific) variable(17-21)
	citizen.age=24;						//int data type
	citizen.height=5.5f;				//float data type
	citizen.nri=false;					//boolean data type
	citizen.mother_name="lachu";		//String data type
System.out.println(citizen.citizenname);//print object specfic variable(22-27)
System.out.println(citizen.age);
System.out.println(citizen.height);
System.out.println(citizen.nri);
System.out.println(citizen.mother_name);
System.out.println(citizen.First);
//System.out.println(capital);			//print class  specfic variable
System.out.println(India.capital);		//print class  specfic variable with help of Class name
	
	India2 citizen2=new India();
	citizen2.citizenname="santhiya";
	citizen2.age=25;
	citizen2.height=5.5f;
	citizen2.nri=false;
	citizen2.mother_name="rani";
System.out.println(citizen2.citizenname);
System.out.println(citizen2.age);
System.out.println(citizen2.height);
System.out.println(citizen2.nri);
System.out.println(citizen2.mother_name);
System.out.println(citizen2.First);
System.out.println(India.capital);
	citizen.applyPAN();					//Method calling
	//citizen.applyPAN(citizen.citizenname);
	//System.out.println(citizen.applyPAN());
	



} 
void applyPAN() 						//method signature(without no argument)
{ 										//Method definition
	System.out.println("PAN applied");
}	

/*void applyPAN( String name){ 
System.out.println("PAN applied"+name);
}*/	
	
	
	
	
	
	
	
	
}