package thinkinginjava.chap10innerclass.page105;

import javax.print.attribute.standard.RequestingUserName;

import thinkinginjava.chap10innerclass.page104.Destination;

/*
 * 可以在一个方法或者任意的作用域内定义内部类
 *   ----实现了某个接口，可以从创建并返回对其的引用
 *   ----如要解决复杂问题，想创建一个类来辅助解决，但又不希望对外暴露
 * Nesting  a class within a method
 * 作用域仅限于方法内
 */
public class Parcel5 {
	private String  testlabel;
	
	
	public Destination destination(String s) {
		class PDestination implements Destination{
		    private String label;
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
			
			private PDestination(String whereTo) {
				label = whereTo;
				Parcel5.this.testlabel = "nihao";
			}	
			
		
		}
	return new PDestination(s);
		
   }
	
	public static void main(String args[]){
		Parcel5 parcel5 = new Parcel5();
		Destination destination = parcel5.destination("hello");
		System.out.println(destination.getClass());
		System.out.println(destination.readLabel());
        System.out.println(parcel5.testlabel);
		
	}
}
