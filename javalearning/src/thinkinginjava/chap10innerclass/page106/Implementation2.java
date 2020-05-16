package thinkinginjava.chap10innerclass.page106;

public class Implementation2 implements Service{
   
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("implementation2 method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.print("implementation2 mehtod2");
	}
   
	private Implementation2() {}
	
	public static ServiceFactory factory =
			new ServiceFactory() {
		public Service getService() {
			return new Implementation2();
		}
	};
	
}
