public class Shop5{ 
	
	public static void main(String[] args){
	
	Shop5 sara=new Shop5();
	TV5 tv=sara.geTV( );
	tv.delivery();
	
	} 
	public  TV5  geTV( ){ 
		TV5 sonytv=new TV5();
		//System.out.println("name "+name+" "+sonytv);
		return sonytv;
	}
	
	
}
