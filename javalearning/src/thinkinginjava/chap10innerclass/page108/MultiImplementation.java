package thinkinginjava.chap10innerclass.page108;

/*
 * ���ӵ�е��ǳ����������ֻ࣬��ʹ���ڲ������ʵ�ֶ��ؼ̳�
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
