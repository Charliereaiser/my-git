class Storag{
	private int[] cells=new int[10];
	private int inPos,outPos;
	public void put(int num) {
		cells[inPos]=num;
		System.out.println("在cells["+inPos+"]中放入数据---"+cells[inPos]);
		inPos++;
		if(inPos==cells.length)
			inPos=0;
	}
	public void get() {
		int data=cells[outPos];
		System.out.println("从cells["+outPos+"]中取出数据"+data);
		outPos++;
		if(outPos==cells.length)
			outPos=0;
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
public class Example15{
	public static void main(String[] args) {
		Storag st = new Storag();
		Input input=new Input (st);
		Output output=new Output(st);
		new Thread(input).start();
		new Thread(output).start();
	}
}
