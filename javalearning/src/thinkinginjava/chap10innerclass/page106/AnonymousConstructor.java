package thinkinginjava.chap10innerclass.page106;
/*
 * i不一定需要final，是由于i只是匿名内部类的构造器使用
 */
abstract class Base{
	public Base(int i) {
		System.out.println("Base Constructor, i = "+i);
	}
	public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
    	return new Base(i){
    		{
    			System.out.println("Inside instance initialzer");
    		}
    		
			@Override
			public void f() {
				// TODO Auto-generated method stub
				System.out.println("In anonymous f()");
			}
    		
    	};
    }
    
    public static void main(String args[]) {
       Base base = AnonymousConstructor.getBase(100);
       base.f();
    }
}
