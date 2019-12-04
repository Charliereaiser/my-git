public class Example14
{
	public static void main(String[] args){
	    SaleThread d1=new SaleThread(true);
		SaleThread d2=new SaleThread(false);
		new Thread(d1,"chinese").start();
		new Thread(d2,"american").start();
	}
	
}

class SaleThread implements Runnable
{
	static Object cha=new Object();
    static Object dao=new Object();
	private boolean flag;
    SaleThread(boolean flag){
	    this.flag=flag;
	}
	public void run(){
	      if(flag){
			  while(true){
				  synchronized(cha){
                      System.out.println(Thread.currentThread().getName()+"---if---cha");
				      synchronized(dao){
                          System.out.println(Thread.currentThread().getName()+"---if---dao");
					  }
				  }
			  }
		  }else{
			  while(true){
				  synchronized(dao){
                      System.out.println(Thread.currentThread().getName()+"---else---dao");
				      synchronized(cha){
                          System.out.println(Thread.currentThread().getName()+"---else---cha");
					  }
				  }
			  }

		  }

	 }

     




}