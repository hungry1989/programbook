package thinkinginjava.chap10innerclass.page108;
/*
 * 1.Ϊʲô��Ҫ�ڲ���
 *   ----�ڲ����ṩ��ĳ�ֽ�������Χ��Ĵ���
 *   ----ÿ���ڲ��඼�ܶ����ļ̳���һ���ӿڵ�ʵ�֣������ⲿ���Ƿ��Ѿ��̳�
 *   ----�ڲ���ʹ�ö��ؼ̳и��ӵ�����
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
