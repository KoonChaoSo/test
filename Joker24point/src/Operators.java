
public class Operators {
	
	private static Operators instance;
	private Operators(){
		
	}
	//防止过多地新建实例消耗内存，使用单例模式
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
