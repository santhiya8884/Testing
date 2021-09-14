public class Calculator1{
	//int num1=90, num2=89;  							//static variable
	
public static void main(String[] args){
	Calculator1 calcobj= new Calculator1();				//object creation 
int result=calcobj.add(5,55); 							//Method calling statement
	calcobj.multiply(result);
System.out.println("Result is"+result);
	System.out.println(calcobj); 						//Hashcode
	System.out.println(result);
}
	void multiply(int result){ 
	System.out.println("haiiiiiiiiiiiiii" + result*100);
	}
	
	
public int add(int num1, int num2){
	//int  num1=90, num2=89;
	num1=90; num2=89;
	//System.out.println(calcobj);
	//System.out.println("Added...."+ (num1+num2));
	return num1+num2;							  			//Return statement 
	//return num1, num2;
	//System.out.println("Hai"); 							//unreachable statement

}
}




























