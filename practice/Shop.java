class Shop{
	static String owner="santhiya";
	String brand;
	int price;
	int discount;
	
	
	Shop(String brand, int price){
	this.brand=brand;
	this.price=price;
	}
	
	Shop(String brand, int price,int discount){
	this.brand=brand;
	this.price=price;
	this.discount=discount;
	}
	Shop(){
	}
	
	public static void main(String[] args){
		Shop prod1=new Shop("ABC",32);
		Shop prod2=new Shop("DEF",1);
		Shop prod3=new Shop("GHI",1,90);
		Shop printer=new Shop();
		System.out.println(prod1.brand+" " + " "+prod1.price);
		System.out.println(prod2.brand+" "+" "+prod2.price);
		System.out.println(prod2.brand+" "+" "+prod2.price+" "+prod3.discount);
	
	
	}
}