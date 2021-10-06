class Tv{
String channelName;
int price;
	
Tv(String channelName, int price){
this.channelName=channelName;
this.price=price;
}	
	
	
	
	
public static void main(String[] args){

//paramererzied constructor or 1 argument passed constructor
Tv channel1=new Tv("sun tv",100);
Tv channel2=new Tv(150,"vijay tv");

}
}