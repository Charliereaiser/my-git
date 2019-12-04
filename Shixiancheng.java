class Shixiancheng{
	public static void main(String[] args) {
		JJJ st = new JJJ();
		UUU p=new UUU (st);
		TTT v=new TTT (st);
		new Thread(p).start();
		new Thread(p).start();
		new Thread(p).start();
		new Thread(p).start();
		new Thread(p).start();
		new Thread(p).start();
		new Thread(p).start();
		new Thread(p).start();
		new Thread(p).start();
		new Thread(p).start();
		new Thread(v).start();
	}
}
class JJJ{
	int[] a=new int[120];
	int[] g=new int[12];
	public static int b=1,c=0;
	private int d=1,e,h,o;
	public synchronized void shuchu() {
		try {
		    a[0] = 0;
		    g[d]=0;
		    for(int i=0;i<10;i++) {
		    a[b]=a[b-1]+1;
		    g[d]=g[d]+a[b];
		    b++;
		    }
		    e=b-10;
		    h=b-1;
			System.out.println("第"+d+"个线程"+e+"到"+h+"的和为--"+g[d]);
			d++;
	    
	    	this.notify();
	   
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public synchronized void he() {
		try {
			while(d<10) {
				this.wait();
			}
		for(int p=1;p<=10;p++) {
			o=o+g[p];
		}
		System.out.println("十个线程相加为"+o);
		
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}
class UUU implements Runnable{
	private JJJ st;
	UUU(JJJ st){
		this.st=st;
	}
	public void run() {	
			st.shuchu();
	}
}
class TTT implements Runnable{
	private JJJ st;
	TTT(JJJ st){
		this.st=st;
	}
	public void run() {	
			st.he();
	}
}