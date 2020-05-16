package thinkinginjava.chap10innerclass.page106;
/*
 * 带有构造器的匿名内部类
 */
public class Parcel8 {
  
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
		    public  int value() {
		    	return super.value() * 47;
		    }
		};
	}
	
	public static void main(String args[]) {
		Parcel8 parcel8 = new Parcel8();
		Wrapping wrapping = parcel8.wrapping(10);
		System.out.print(wrapping.value());
	}
}
