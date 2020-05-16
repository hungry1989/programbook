package thinkinginjava.chap10innerclass.page106;

import thinkinginjava.chap10innerclass.page104.Contents;

/*
 * 匿名内部类
 * Returning an instance oof an anonymous inner class
 */
public class Parcel7 {
    public Contents contents() {
    	return  new Contents(){
    		private int i = 0;
    		public int value() {
    			return i;
    		}
    	};
    }
    
    public static void main(String args[]) {
    	Parcel7 parcel7 = new Parcel7();
    	Contents contents = parcel7.contents();
    	System.out.print(contents.getClass());
    }
}
