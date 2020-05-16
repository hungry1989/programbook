package thinkinginjava.chap10innerclass.page110;
/*
 * 当继承了某个外围类时，外围类的内部类和当前类的内部类是
 * 属于两个不同的实体，分别在不同的命名空间内
 */

class Egg{
	private Yolk y;
	protected class Yolk{
		public Yolk() {
			System.out.println("Egg.Yolk()");
		}
	}
	public Egg() {
		// TODO Auto-generated constructor stub
		System.out.println("New Egg()");
		y = new Yolk();
	}
}
public class BigEgg extends Egg{
    public class Yolk{
    	public Yolk() {
			// TODO Auto-generated constructor stub
    		System.out.println("BigEgg.Yolk()");
		}
    	
    }
    
    public static void main(String args[]) {
    	new BigEgg();
    }
}
