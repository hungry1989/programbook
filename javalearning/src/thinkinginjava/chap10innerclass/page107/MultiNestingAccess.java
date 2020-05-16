package thinkinginjava.chap10innerclass.page107;
/*
 * 一个内部类不管被嵌套多少层都能透明的访问所有它所嵌入的外围类的所有成员
 * 外部成员即使是private也不影响
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