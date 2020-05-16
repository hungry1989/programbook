package thinkinginjava.chap10innerclass.page105;

import javax.print.attribute.standard.RequestingUserName;

import thinkinginjava.chap10innerclass.page104.Destination;

/*
 * ������һ����������������������ڶ����ڲ���
 *   ----ʵ����ĳ���ӿڣ����ԴӴ��������ض��������
 *   ----��Ҫ����������⣬�봴��һ������������������ֲ�ϣ�����Ⱪ¶
 * Nesting  a class within a method
 * ����������ڷ�����
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
