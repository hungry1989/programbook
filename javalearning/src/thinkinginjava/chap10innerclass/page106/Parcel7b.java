package thinkinginjava.chap10innerclass.page106;

import thinkinginjava.chap10innerclass.page104.Contents;

public class Parcel7b {
    class Mycontents implements Contents{
        private int i;
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
    	
    }
    
    public Contents contents() {
    	return new Mycontents();
    }
    
    public static void main(String args[]) {
    	Parcel7b parcel7b = new Parcel7b();
    	Contents contents  = parcel7b.contents();
    	System.out.println(contents.getClass());
    }
}
