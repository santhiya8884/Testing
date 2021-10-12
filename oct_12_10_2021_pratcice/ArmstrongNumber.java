//Armstrongnumbr
public class ArmstrongNumber{

public static void main(String[] args){
int number=121,arm=0,num;
int numdep=number;
	while(number!=0){
	num=number%10;
	arm=(arm*10)+num;
	number=number/10;
	
	}
	if(numdep==arm){
	System.out.println("Armstrong Number");
	}
	else{
	System.out.println("No armstrong number");}



}
}