package thinkinginjava.chap10innerclass.page107;
/*
 * һ���ڲ��಻�ܱ�Ƕ�׶��ٲ㶼��͸���ķ�����������Ƕ�����Χ������г�Ա
 * �ⲿ��Ա��ʹ��privateҲ��Ӱ��
 */
public class MultiNestingAccess {
     public static  void  main(String args[]) {
    	 MNA mna = new MNA();
    	 MNA.A mnaa = mna.new A();
    	 MNA.A.B mnab = mnaa.new B();
    	 mnab.h();
     }
}

class  MNA{
	private  void f() {
		System.out.println("f()");
	}
	class A {
		private  void g() {
			System.out.println("g()");
		}
		public class B {
			void h() {
				System.out.println("h()");
				g();
				f();
			}
		}
	}
}