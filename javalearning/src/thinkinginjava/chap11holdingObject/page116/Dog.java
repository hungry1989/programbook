package thinkinginjava.chap11holdingObject.page116;

public class Dog extends Pet{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
     @Override
     public void say() {
    	 System.out.println("ÍôÍôÍô......");
     }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 1;
	}
}
