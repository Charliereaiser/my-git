public class dayinxiancheng{
	public static void main(String[] arge){
		MyThread myThread = new MyThread();
		myThread.start();
		while (true){
				System.out.println("�߳�1��ӡ������");
		}
	}
}
class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println("�߳�2��ӡ������");
		}
	}
}