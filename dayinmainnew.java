public class dayinmainnew{
	public static void main(String[] arge){
		MyThread myThread = new MyThread();
		Thread thread=new Thread(myThread);
		thread.start();
		int m = 1;
		while (true){
				if(m<=100)
				System.out.println("main��ӡ��"+m+++"��");
		}
	}
}
class MyThread extends Thread{
	int n = 1;
	public void run(){
		while(true){
			if(n<=50)
			System.out.println("new��ӡ��"+n+++"��");
		}
	}
}