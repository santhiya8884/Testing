    class Benson{  
		static int  mark=100;
       void eat(){System.out.println("animal is eating...");}  
    }  
      
    class Chennai extends Benson{  
		static int mark=200;
		String msg="hai";
     void eat(){
		 System.out.println("dog is eating...");}  
      
     public static void main(String args[]){  
      Benson a=new Chennai(); //////// 
      a.eat(); 
	  System.out.println(a.mark);
	System.out.println(a.mark);
     }  
    }  