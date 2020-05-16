package thinkinginjava.chap10innerclass.page107;

import thinkinginjava.chap10innerclass.page104.Contents;
import thinkinginjava.chap10innerclass.page104.Destination;

/*
 * 1.嵌套类
 * 2.若不需要内部类和外部类对象之间有联系，可以直接将内部类声明为static（嵌套类）
 * 3.不能从嵌套类的对象中访问非静态的外围类对象
 */
public class Parcel11 {
	private static class ParcelContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
	}

	protected static class ParcelDestinatiom implements Destination{
        private String  label;
        private  ParcelDestinatiom(String whereTo) {
              label = whereTo;
        }
		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return label;
		}
		
		public static void f() {}
		static int x =10;
	    static class  AnotherLevel{
	    	public static void f() {}
	    	static int x = 20;
	    }	
		
	}
	
	public static Destination destination(String s) {
		return new ParcelDestinatiom(s);
	}
	
	public static Contents contents() {
		return new ParcelContents();
	}
	
	public static void main(String args[]) {
		Contents contents = contents();
		Destination destination = destination("Tasmania");
		System.out.println(contents.getClass());
		System.out.println(destination.getClass());
		System.out.println(destination.readLabel());
	}
}
