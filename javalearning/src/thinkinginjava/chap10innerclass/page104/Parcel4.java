package thinkinginjava.chap10innerclass.page104;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Parcel4 {
    
	private class PContents implements Contents{
        private int i=11;
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}
		
	}
	
	protected class PDestination implements Destination{
        private String  label;
		@Override
		public String readLabel() {
			// TODO Auto-generated method stub
			return label;
		}
		private PDestination(String whereTo) {
			label = whereTo;
		}
	}
	
	public PDestination destination(String  s) {
		return new PDestination(s);
	}
	
	public PContents contents() {
		return new PContents();
	}
	
	
}
