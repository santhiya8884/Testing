class Library{         					  //create an class Library
	static String libraryname;            //Global- static varible
	static int fees;					  //Global- static variable
	String readername;					  //Global- non-static variable
public static void main(String[] args){   //main method
	Library reader=new Library();		  //object creation
	reader.readername="santhiya";		  //non staic variale access with help of the object
	fees=1200;							  //static variable access
	System.out.println("My name" +reader.readername);		//prit name
	
}
}