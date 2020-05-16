package thinkinginjava.chap10innerclass.page109;
/*
 * 内部类的继承
 * 某外部类继承内部类时必须要传一个指向外围类的对象的引用
 */
class WithInner{
	class Inner{
		
	}
}
public class InheritInner extends WithInner.Inner{
      InheritInner(WithInner wi) {
		// TODO Auto-generated constructor stub
    	  wi.super();
	}
      
      public static void main(String args[]) {
    	  WithInner wi = new WithInner();
    	  InheritInner ii = new InheritInner(wi);
      }
}
