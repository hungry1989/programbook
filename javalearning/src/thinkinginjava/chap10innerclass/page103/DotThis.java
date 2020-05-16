package thinkinginjava.chap10innerclass.page103;
/*
 * 对外部类对象引用
 * Qualifying access to the outer-class object
 */
public class DotThis {
     void f() {
    	 System.out.println("DotThis.f()");
     }
     
     public class Inner{
    	 public DotThis outer() {
    		 return DotThis.this;
    	 }
     }
     
     public Inner inner() {
    	 return new Inner();
     }
     
     public static void main(String args[]) {
    	 DotThis dThis  = new DotThis();
    	 DotThis.Inner dtInner = dThis.inner();
    	 dtInner.outer().f();
     }
}
