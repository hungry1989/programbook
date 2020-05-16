package thinkinginjava.chap10innerclass.page107;
/*
 * 1.接口内部的类
 * 2.嵌套类可以作为接口的一部分
 * 3.使用场景----某些代码需要被接口的所有不同实现所公用
 */
public interface ClassInInterface {
     void howdy();
     class Test implements ClassInInterface{

		@Override
		public void howdy() {
			// TODO Auto-generated method stub
			System.out.println("Howdy!");
		}
    	 
		public static void main(String args[]) {
			new Test().howdy();
		}
		
     }
}
