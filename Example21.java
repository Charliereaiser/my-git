public class Example21{
	public static void main (String[] args){
		try{
			int result=divide(4,0);
			System.out.println(result);
		}catch(Exception e){
			System.out.println("������쳣��ϢΪv��"+e.getMessage());
		}
		System.out.println("�����������ִ��...");
	}
	public static int divide(int x,int y){
		int result=x/y;
		return result;
	}
}