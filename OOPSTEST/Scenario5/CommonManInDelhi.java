//Scenario #5:
package india.newDelhi;
import  tamilnadu.chennai.TrafficRules;
public class CommonManInDelhi implements TrafficrulesDelhi,TrafficRules{ 
public static void main(String[] args){  
CommonManInDelhi cmind=new CommonManInDelhi();
 cmind.goByDiseselVehicle();
 cmind.dontgoByDiseselVehicle();
 cmind.goByByCycle();


}
	void dontgoByDiseselVehicle(){
		System.out.println(" No Diesel");	
	}
	public void goByByCycle(){
		System.out.println("Bycyle");	
	}
	public void goByDiseselVehicle(){
		System.out.println("Diesel");
	}

}	