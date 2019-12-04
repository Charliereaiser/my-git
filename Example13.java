public class Example13
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
	public void run(){
	     while(true){
            ff();
			if(tickets<=0){
			   break;
			}
		 } 
	 }
     private synchronized void ff(){
			 if(tickets>0){
				 try{
			     Thread.sleep(10);
			     }catch(InterruptedException e){
			     e.printStackTrace();
			     }
			  System.out.println(Thread.currentThread().getName()+"---卖出得票"+tickets--);
			 }
	 }



}