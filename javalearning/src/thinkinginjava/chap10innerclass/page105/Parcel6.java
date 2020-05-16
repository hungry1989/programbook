package thinkinginjava.chap10innerclass.page105;


/*
 * 作用域内嵌入一个内部类
 * 在TrackingShip的作用域之外，内部类不可用
 * Nesting a class within a scope
 */
public class Parcel6 {
      
	private void internalTracking(boolean b){
		
		if(b) {
			class TrackingShip{
				private String id;
				public TrackingShip(String s) {
					// TODO Auto-generated constructor stub
				 id = s;
				}
				String getShip() {
					return id;
				}
			}
		}	
	}
	
	public void track() {
		internalTracking(true);
	}
	
	public static void main(String args[]) {
		Parcel6 parcel6 = new Parcel6();
		parcel6.track();
	}
}
