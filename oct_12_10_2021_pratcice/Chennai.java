    class Benson{  
		static int  mark=100;
		String msg="hello";
		protected float f=100000.688888888888889999999999555555222f;;
		
      protected void eat(){System.out.println("animal is eating...");}  
    }  
      
    class Chennai extends Benson{  
		static int mark=200;
		String msg="hai";
		protected float f=100000.6888888888f;
    public  void eat(){
		 System.out.println("dog is eating...");}  
      
     public static void main(String args[]){  
      Benson a=new Chennai(); //////// 
		
      //a.eat(); 
	 // System.out.println(this.mark);
		 System.out.println(a.f);
	  
     }  
    }  