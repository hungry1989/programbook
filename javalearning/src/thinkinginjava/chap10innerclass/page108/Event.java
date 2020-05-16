package thinkinginjava.chap10innerclass.page108;
/*
 * 1.Ӧ�ó����ܿ����������ĳ���ض������һ�����һ����
 * 2.һ����Ҫ�̳�һ��������࣬������ĳЩ����
 * 3.��д���붨��Ӧ�ó����ṩ��ͨ�ý������
 * 4.�ڲ�������
 *   ----��ܵ�����ʵ�����ɵ����ഴ���ģ��Ӷ��ܹ���װϸ��
 *   ----�ڲ��������������ĸ���action
 *   ----�ڲ�����Ժܷ���ķ����ⲿ��������Ա
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime) {
		// TODO Auto-generated constructor stub
    	this.delayTime = delayTime;
	}
    
    public void start() {
    	eventTime = System.nanoTime()+delayTime;
    }
    
    public boolean ready() {
    	return System.nanoTime()>=eventTime;
    }
    
    public abstract void action();
}
