package thinkinginjava.chap11holdingObject.page116;

public class Cattle extends Pet{

	public Cattle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	 @Override
	 public void say() {
		 System.out.println("ίθίθίθ......");
	 }


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 3;
	}
}
