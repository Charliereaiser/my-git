public class Example05{
	public static void main(String[] arge){
		Drivers dr=new Drivers();
		new Thread(dr,"˾��1").start();
		new Thread(dr,"˾��2").start();
		new Thread(dr,"˾��3").start();
		new Thread(dr,"˾��4").start();
		new Thread(dr,"˾��5").start();
	}
}
class Drivers implements Runnable{
	private int people = 100;
	public void run(){
		while(true){
			if(people>0){
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name+"���ڽ��͵�"+people--+"λ�˿�");
			}
		}
	}
}