class Storag{
	private int[] cells=new int[10];
	private int inPos,outPos;
	private int a;
	public synchronized void put(int num) {
		try {
			while(a==cells.length) {
				this.wait();
			}
			cells[inPos]=num;
			System.out.println("在cells["+inPos+"]中放入数据---"+cells[inPos]);
			inPos++;
			if(inPos==cells.length)
				inPos=0;
			a++;
			this.notify();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public synchronized void get() {
		try {
			while(a==0) {
				this.wait();
			}
			int data=cells[outPos];
			System.out.println("从cells["+outPos+"]中取出数据"+data);
			cells[outPos]=0;
			outPos++;
			if(outPos==cells.length)
				outPos=0;
			a--;
			this.notify();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
class Input implements Runnable{
	private Storag st;
	private int num;
	Input(Storag st){
		this.st=st;
	}
    public void run() {
    	while(true) {
    		st.put(num++);
    	}
    }
}

class Output implements Runnable{
	private Storag st;
	Output(Storag st){
		this.st=st;
	}
    public void run() {
    	while(true) {
    		st.get();
    	}
    }
}
public class Example16{
	public static void main(String[] args) {
		Storag st = new Storag();
		Input input=new Input (st);
		Output output=new Output(st);
		new Thread(input).start();
		new Thread(output).start();
	}
}
