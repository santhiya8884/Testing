class MobileShowRoom{
	String product1,product2,product3;
	MobileShowRoom(){
}	

MobileShowRoom(String product1,String product2){
	this.product1=product1;
	this.product2=product2;
	
//System.out.println("purchase item is "+product1+" "+product2);
}	
MobileShowRoom(String product1,String product2,String product3){
	this(product1,product2);
//System.out.println("purchase item is "+product1+" "+product2+" "+product3);
	this.product3=product3;
}	
	void purchase(){
System.out.println("purchase item is "+product1+" "+product2+" "+product3);

}

}



public class  ThisLastExample{
public static void main(String[] args){

ThisLastExample person1=new ThisLastExample();
MobileShowRoom person2=new MobileShowRoom();
MobileShowRoom person3=new MobileShowRoom("ear phone","modem");
MobileShowRoom person4=new MobileShowRoom("ear phone","modem","redmimobile");
	person3.purchase();
	person4.purchase();
}



}