package thinkinginjava.chap10innerclass.page107;
/*
 * 1.�ӿ��ڲ�����
 * 2.Ƕ���������Ϊ�ӿڵ�һ����
 * 3.ʹ�ó���----ĳЩ������Ҫ���ӿڵ����в�ͬʵ��������
 */
public interface ClassInInterface {
     void howdy();
     class Test implements ClassInInterface{

		@Override
		public void howdy() {
			// TODO Auto-generated method stub
			System.out.println("Howdy!");
		}
    	 
		public static void main(String args[]) {
			new Test().howdy();
		}
		
     }
}
