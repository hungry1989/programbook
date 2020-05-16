package thinkinginjava.chap10innerclass.page108;


/*
 * 1.closure闭包是一个可调用的对象，记录了创建它的作用域的一些信息
 * 2.回调允许对象携带一些信息，使它在稍后的某个时刻调用初始的对象
 * 3.通过内部类提供的闭包功能比指针更灵活、安全
 * 4.回调可以在运行时动态的决定需要调用什么方法
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
 * 1.继承MyIncrement类
 * 2.实现Incrementable接口
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
