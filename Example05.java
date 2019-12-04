public class Example05{
	public static void main(String[] arge){
		Drivers dr=new Drivers();
		new Thread(dr,"司机1").start();
		new Thread(dr,"司机2").start();
		new Thread(dr,"司机3").start();
		new Thread(dr,"司机4").start();
		new Thread(dr,"司机5").start();
	}
}
class Drivers implements Runnable{
	private int people = 100;
	public void run(){
		while(true){
			if(people>0){
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name+"正在接送第"+people--+"位乘客");
			}
		}
	}
}