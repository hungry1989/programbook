package thinkinginjava.chap10innerclass.page106;

public class Implementantion1 implements Service{

	private  Implementantion1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implementation1 method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Implementation1 method2");
	}
	
	public static ServiceFactory factory = 
			new ServiceFactory() {
		public Service getService() {
			return new Implementantion1();
		}
	};

}
