import java.util.Random;

public class People {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		Storage st=new Storage();
		
		Land ld=new Land(st);
		Quite qt=new Quite(st);
		
		new Thread(ld).start();
		new Thread(qt).start();
		
	}

}

class Land implements Runnable{
	
	private Storage st;
	private int num;
	private String s;
	
	public Land(Storage st){
		
		this.st=st;
	}
	
	public void run(){
		
		while(true){
			
			Random r=new Random();
			int a=r.nextInt(10);
			if(a==1){
                 
				try{
					
					Thread.sleep(10);
				}catch(Exception e){
					
					
				}
			}
			
			
			 
			num=r.nextInt(100);
			
			s=String.valueOf(num);
			
			st.userLand(s);
		}
	}
}

class  Quite implements Runnable {
	
	private Storage st;
	
	public Quite(Storage st){
	
		this.st=st;
	}
	
	public void run(){
		
		while(true){
			
			Random r=new Random();
			int a=r.nextInt(10);
			if(a==1){
				
				try{
					
					Thread.sleep(100);
				}catch(Exception e){
					
					
				}
			
			}
			
			st.userQuite();
		}
	}
	
}

class Storage{
	
	private String[] str=new String[100];
	private int inPos,outPos;
	private int cnt=0;
	
	
	public synchronized void userLand(String num){
		
		 try{
			 
			 while(cnt==str.length){
				 
				 this.wait();
			 }
			 
			 str[inPos]=num;
			 
			 System.out.println(num+"--is landing,   Pos="+inPos);
			 
			 inPos++;
			 
			 if(inPos==str.length){
				 
				 inPos=0;
			 }
			 
			 cnt++;
			System.out.println("total num ="+cnt); 
			 
			Thread.sleep(10);
			this.notify();
		 }catch(Exception e){
			 
			 e.printStackTrace();
		 }
		
	}
	
	public synchronized void userQuite(){
		
		try{
			
			while(cnt==0){
				
				this.wait();
			}
			
			str[outPos]="-1";
			
			outPos++;
			
			if(outPos==str.length){
				
				outPos=0;
			}
			
			cnt--;
			System.out.println("total num ="+cnt); 
			
			Thread.sleep(100);
			this.notify();
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}	
}
