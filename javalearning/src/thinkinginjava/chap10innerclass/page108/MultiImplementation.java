package thinkinginjava.chap10innerclass.page108;

/*
 * 如果拥有的是抽象类或具体类，只有使用内部类才能实现多重继承
 */
public class MultiImplementation {
    static void tasksD(D d) {}
    static void tasksE(E e) {}
    public static void main(String args[]) {
    	Z z = new Z();
    	tasksD(z);
    	tasksE(z.makeE());
    }
}
class D{}
abstract class E{
	
}
class Z extends D{
	E makeE() {
		return new E() {};
	}
}
