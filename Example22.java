public class Example22{
	public static void main (String[] args){
		try{
			int result=divide(4,0);
			System.out.println(result);
		}catch(Exception e){
			System.out.println("捕获的异常信息为v："+e.getMessage());
			return;
		}finally{
			System.out.println("进入finally代码块");
		}
		System.out.println("程序继续向下执行...");
	}
	public static int divide(int x,int y){
		int result=x/y;
		return result;
	}
}