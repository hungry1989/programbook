package thinkinginjava.chap10innerclass.page106;

public class Factories {
    
	 public static void ServiceConsumer(ServiceFactory factory) {
		 Service service = factory.getService();
		 service.method1();
		 service.method2();
	 }
	 
	 public static void main(String args[]) {
		 ServiceConsumer(Implementantion1.factory);
		 ServiceConsumer(Implementation2.factory);
	 }
	
}
