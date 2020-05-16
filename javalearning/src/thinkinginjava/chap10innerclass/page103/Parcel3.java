package thinkinginjava.chap10innerclass.page103;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/*
 * 嵌套类（静态内部类）不需要对外部类对象引用
 * Using .New to create instances of inner classes
 */
public class Parcel3 {
    
	class Contents{
		private int i =11;
		public int value() {
			return i;
		}
	}
	
	class Destination{
		private String label;
		public Destination(String whereTo) {
			// TODO Auto-generated constructor stub
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	
	public static void main(String args[]) {
		Parcel3 parcel3 = new Parcel3();
		Parcel3.Contents pcContents = parcel3.new Contents();
		Parcel3.Destination pDestination 
		= parcel3.new Destination("Tasmania");
	}
	
}
