package thinkinginjava.chap10innerclass.page103;
/*
 * Creating an inner class directly using the .new systax
 */
public class DotNew {
    
	public class Inner{}
    
	public static void main(String args[]) {
		DotNew dotNew = new DotNew();
		DotNew.Inner dInner = dotNew.new Inner();
	}
}
