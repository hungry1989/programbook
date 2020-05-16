package thinkinginjava.chap10innerclass.page110;
/*
 * ���̳���ĳ����Χ��ʱ����Χ����ڲ���͵�ǰ����ڲ�����
 * ����������ͬ��ʵ�壬�ֱ��ڲ�ͬ�������ռ���
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
