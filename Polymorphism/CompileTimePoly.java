//Method Overloading : obeject calling:
public class CompileTimePoly {

public static void main(String[] args){

CompileTimePoly sara=new CompileTimePoly();
	
sara.work("sara");
sara.work("sara",10000);
/*CompileTimePoly.work("sara");
CompileTimePoly.work("sara",10000);*/
}
public void work(String name){
System.out.println("Searching jobs....");
}
public void work(String name,int salary){
System.out.println("Searching jobs. "+name+" salary expectation "+salary);
}


}