package thinkinginjava.chap10innerclass.page109;
/*
 * �ڲ���ļ̳�
 * ĳ�ⲿ��̳��ڲ���ʱ����Ҫ��һ��ָ����Χ��Ķ��������
 */
class WithInner{
	class Inner{
		
	}
}
public class InheritInner extends WithInner.Inner{
      InheritInner(WithInner wi) {
		// TODO Auto-generated constructor stub
    	  wi.super();
	}
      
      public static void main(String args[]) {
    	  WithInner wi = new WithInner();
    	  InheritInner ii = new InheritInner(wi);
      }
}
