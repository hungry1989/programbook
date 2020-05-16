package thinkinginjava.chap10innerclass.page106;
/*
 * �������Ҫ���ڲ���ķǹ��췽��ʹ�ã������Ҫ��final����
 * construction on an anonymous inner class
 */

import thinkinginjava.chap10innerclass.page104.Destination;

public class Parcel10 {

	public Destination destination(final String dest,final float price) {
		return new Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if(cost > 100) {
					System.out.println("Over budget��");
				}
			}
			
			private String label = dest;
			@Override
			public String readLabel() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}
	
	public static void main(String args[]) {
		Parcel10 parcel10 = new Parcel10();
		Destination destination = parcel10.destination("hello world", 10000);
		System.out.println(destination.readLabel());
	}
}