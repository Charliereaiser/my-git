public class dayinxiancheng{
	public static void main(String[] arge){
		MyThread myThread = new MyThread();
		myThread.start();
		while (true){
				System.out.println("线程1打印出来了");
		}
	}
}
class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println("线程2打印出来了");
		}
	}
}