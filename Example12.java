public class Example12
{
	public static void main(String[] args){
		SaleThread saleThread=new SaleThread();
	new Thread (saleThread,"线程一").start();
	new Thread (saleThread,"线程二").start();
	new Thread (saleThread,"线程三").start();
	new Thread (saleThread,"线程四").start();
	}
}
class SaleThread implements Runnable
{
	private int tickets=10;
	Object lock=new Object();
	public void run(){
	     while(true){
           synchronized (lock){
		   try{
			     Thread.sleep(10);
			 }catch(InterruptedException e){
			     e.printStackTrace();
			 }
			 if(tickets>0){
			  System.out.println(Thread.currentThread().getName()+"---卖出得票"+tickets--);

			 }else{
			 break;
			 }

		   }

		 }
	    
	}
}