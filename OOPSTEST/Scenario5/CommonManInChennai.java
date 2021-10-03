//Scenario #5:sublass1
package tamilnadu.chennai;
public class CommonManInChennai implements TrafficRules{ 
public static void main(String[] args){ 
CommonManInChennai cimc=new CommonManInChennai();
cimc.goByDiseselVehicle();
cimc.goByByCycle();
}
	public void goByDiseselVehicle(){
	System.out.println("Diesel");
	}
	public void goByByCycle(){
	System.out.println("Bycycle");
	}
}