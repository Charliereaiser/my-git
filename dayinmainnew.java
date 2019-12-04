public class dayinmainnew{
	public static void main(String[] arge){
		MyThread myThread = new MyThread();
		Thread thread=new Thread(myThread);
		thread.start();
		int m = 1;
		while (true){
				if(m<=100)
				System.out.println("main打印第"+m+++"次");
		}
	}
}
class MyThread extends Thread{
	int n = 1;
	public void run(){
		while(true){
			if(n<=50)
			System.out.println("new打印第"+n+++"次");
		}
	}
}