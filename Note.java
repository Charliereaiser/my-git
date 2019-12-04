public class Note{
	public static void main(String[] arge){
		Teacher tr=new Teacher();
		new Thread(tr,"老师1").start();
		new Thread(tr,"老师2").start();
		new Thread(tr,"老师3").start();
	}
}
class Teacher implements Runnable{
	private int student = 80;
	public void run(){
		while(true){
			if(student>0){
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name+"正在分发第"+student--+"份笔记");
			}
		}
	}
}