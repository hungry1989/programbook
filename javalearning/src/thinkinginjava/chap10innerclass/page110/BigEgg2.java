package thinkinginjava.chap10innerclass.page110;
/*
 * 当继承了某个外围类时，外围类的内部类和当前类的内部类是
 * 属于两个不同的实体，分别在不同的命名空间内
 * 内部类也可以明确的继承某个内部类
 */


class  Egg2{
	protected class Yolk{
		public Yolk() {
			System.out.println("Egg2.Yolk");
		}
		public void f() {
			System.out.println("Egg2.Yolk.f()");
		}
	}
	
	private Yolk y = new Yolk();
	
	public Egg2() {
		System.out.println("new Egg2()");
	}
	public void insertYolk(Yolk yy) {
		y = yy;
	}
	public void g() {
		y.f();
	}
	
}

public class BigEgg2 extends Egg2{
    public class Yolk extends Egg2.Yolk{
    	public Yolk() {
			// TODO Auto-generated constructor stub
    		System.out.println("BigEgg2.Yolk()");
		}
    	public void f() {
    		System.out.println("BigEgg2.Yolk.f()");
    	}
    }
    
    public BigEgg2() {
    	insertYolk(new Yolk());	
    }
    
    
    public static void main(String args[]) {
    	Egg2 egg2 = new BigEgg2();
    	egg2.g();
    }
}
