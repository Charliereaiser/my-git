public class Note{
	public static void main(String[] arge){
		Teacher tr=new Teacher();
		new Thread(tr,"��ʦ1").start();
		new Thread(tr,"��ʦ2").start();
		new Thread(tr,"��ʦ3").start();
	}
}
class Teacher implements Runnable{
	private int student = 80;
	public void run(){
		while(true){
			if(student>0){
				Thread th = Thread.currentThread();
				String th_name = th.getName();
				System.out.println(th_name+"���ڷַ���"+student--+"�ݱʼ�");
			}
		}
	}
}