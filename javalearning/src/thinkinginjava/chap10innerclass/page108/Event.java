package thinkinginjava.chap10innerclass.page108;
/*
 * 1.应用程序框架可以用来解决某类特定问题的一个类或一组类
 * 2.一般需要继承一个类或多个类，并覆盖某些方法
 * 3.编写代码定制应用程序提供的通用解决方案
 * 4.内部类允许
 *   ----框架的完整实现是由单个类创建的，从而能够封装细节
 *   ----内部类用来解决问题的各种action
 *   ----内部类可以很方便的访问外部类的任意成员
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
