
public class Operators {
	
	private static Operators instance;
	private Operators(){
		
	}
	//��ֹ������½�ʵ�������ڴ棬ʹ�õ���ģʽ
	public static Operators getInstance(){
		if(null == instance){
			instance = new Operators();
		}
		return instance;
	}
	public double plus(double a,double b){
		return a+b;
	}
	public double minus(double a,double b){
		return a-b;
	}
	public double multiplication(double a,double b){
		return a*b;
	}
	public double division(double a,double b){
		return a/b;
	}
	
}
