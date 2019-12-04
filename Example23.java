public class Example23{
	public static void main (String[] args){
		int result=divide(4,0);
		System.out.println(result);
	}
	public static int divide(int x,int y)throws Exception{
		int result=x/y;
		return result;
	}
}