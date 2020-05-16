package thinkinginjava.chap10innerclass.page108;


/*
 * 1.closure�հ���һ���ɵ��õĶ��󣬼�¼�˴��������������һЩ��Ϣ
 * 2.�ص��������Я��һЩ��Ϣ��ʹ�����Ժ��ĳ��ʱ�̵��ó�ʼ�Ķ���
 * 3.ͨ���ڲ����ṩ�ıհ����ܱ�ָ�������ȫ
 * 4.�ص�����������ʱ��̬�ľ�����Ҫ����ʲô����
 * 5.Using inner classes for callbacks
 */
public class Callbacks {
   public static void main(String args[]) {
	   Callee1 callee1 = new Callee1();
	   Callee2 callee2 = new Callee2();
	   MyIncrement.f(callee2);
	   Caller caller = new Caller(callee1);
	   Caller caller2 = new Caller(callee2.getCallbackReference());
	   caller.go();
	   caller.go();
	   caller2.go();
	   caller2.go();
   }
}
interface Incrementable{
	void increment();
}

class Callee1 implements Incrementable{
    private int i = 0;
	@Override
	public void increment() {
		// TODO Auto-generated method stub
		System.out.println(++i);
	}
	
}

class  MyIncrement{
	public void increment() {
		System.out.println("Other Operation");
	}
	static void f(MyIncrement mi){
		mi.increment();
	}
}
/*
 * 1.�̳�MyIncrement��
 * 2.ʵ��Incrementable�ӿ�
 */
class Callee2 extends MyIncrement{
	private int i = 0;
	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}
	
	private class  Closure implements Incrementable{

		@Override
		public void increment() {
			// TODO Auto-generated method stub
			Callee2.this.increment();
		}	
	}
	Incrementable getCallbackReference() {
		return new Closure();
	}
}

class Caller{
	private Incrementable callbackReference;
	Caller(Incrementable cbh) {
		// TODO Auto-generated constructor stub
		callbackReference = cbh;
	}
	void go() {
		callbackReference.increment();
	}
}
