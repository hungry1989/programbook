package thinkinginjava.chap11holdingObject.page116;

public class Sheep extends Pet{

	public Sheep(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
     @Override
	 public void say() {
		 System.out.println("пупупу......");
	 }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 2;
	}
}
