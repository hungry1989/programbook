package thinkinginjava.chap10innerclass.page108;
/*
 * 1.为什么需要内部类
 *   ----内部类提供了某种进入其外围类的窗口
 *   ----每个内部类都能独立的继承自一个接口的实现，不管外部类是否已经继承
 *   ----内部类使得多重继承更加的完整
 */
interface A{}
interface B{}
class X implements A,B{
	
}

class Y implements A{
	B makeB() {
		return new B() {};
	}
}
public class MultiInterfaces {
    
	static void takesA(A a) {
		
	}
	
	static void tasksB(B b) { }
	
	public static void main(String args[]) {
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		tasksB(x);
		tasksB(y.makeB());
	}
	
}
